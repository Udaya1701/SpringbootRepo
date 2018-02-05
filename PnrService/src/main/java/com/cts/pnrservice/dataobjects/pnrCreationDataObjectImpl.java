package com.cts.pnrservice.dataobjects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.pnrservice.constants.QueryConstants;
import com.cts.pnrservice.manager.DBConnectionManager;
import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.CreatePnrRequest;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.PassengerInfoInner;
import com.cts.pnrservice.model.SegmentInfo;
import com.cts.pnrservice.model.SegmentInfoInner;
import com.cts.pnrservice.utils.DateUtils;

public class pnrCreationDataObjectImpl implements pnrCreationDataObject {

	@Override
	public String createPnr(CreatePnrRequest createPnr, DBProperties dbProperties)throws SQLException,Exception {
		//System.out.println("Entered into createPnr DB");
		Connection con = null;
		PreparedStatement ps= null;
		String pnrNumber = "";
		String query = "";
		//String appendPNR = "PNR";
		try {
			con = DBConnectionManager.getInsatnce().getConnection(dbProperties);
			pnrNumber = getMaxPnrNumber(con);
			/*appendPNR = appendPNR+pnrNumber;
			pnrNumber = appendPNR;*/
			
			con.setAutoCommit(false);
			
			query = QueryConstants.QUERY_INSERT_PNR_DETAILS;
			ps = con.prepareStatement(query);
			
			SegmentInfo segInfo = createPnr.getSegmentInfo();
			SegmentInfoInner segDetailsInfo = segInfo.get(0);
			
			ps.setString(1, pnrNumber ); 
			ps.setString(2, segDetailsInfo.getArrivalCode());
			ps.setString(3, segDetailsInfo.getArrivalPoint());
			ps.setString(4, segDetailsInfo.getClassOfService());
			ps.setTimestamp(5, DateUtils.getSqlTimeStampFromMMDDYYYY(segDetailsInfo.getDate()));
			ps.setString(6, segDetailsInfo.getDeparturePoint());
			ps.setString(7, segDetailsInfo.getFlightNumber());
			
			int rowsInserted = ps.executeUpdate();
			
			if(rowsInserted > 0) {
				//System.out.println("PNR Details Inserted successfully!!!");
				DBConnectionManager.closeResources(null, ps, null);
				
				//For inserting passengers details
				query = QueryConstants.QUERY_INSERT_PASSENGERS_DETAILS;
				ps = con.prepareStatement(query);
				
				PassengerInfo psgrInfo = createPnr.getPassengerInfo();
				
				for(PassengerInfoInner psgerDetails:psgrInfo) {
					ps.setString(1, pnrNumber);
					ps.setString(2, psgerDetails.getFirstName());
					ps.setString(3, psgerDetails.getLastName());
					ps.setString(4, psgerDetails.getPhoneNumber());
					
					ps.addBatch();
				}
				
				//ps.executeBatch();
				int[] passInsertSize = ps.executeBatch();
				
				if(passInsertSize.length > 0 && rowsInserted >0) {
					con.commit();
					//System.out.println("inserted pnr and passengers details successfully");
				}else {
					con.rollback();
				}
			}else {
				throw new Exception("Issue during data insert");
			}
		}catch(SQLException sql) {
			con.rollback();
			throw sql;
		}catch(Exception ex) {
			con.rollback();
			throw ex;
		}finally {
			DBConnectionManager.closeResources(null, ps, con);
		}
		return pnrNumber;
	}
	
	public String getMaxPnrNumber(Connection con) throws SQLException {
		PreparedStatement ps= null;
		ResultSet rs = null;
		String query = "";
		String pnrNumber = "";
		try {
			query = QueryConstants.QUERY_GET_MAX_PNR_NUMBER;
			ps = con.prepareStatement(query);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				pnrNumber = rs.getString("maxPnr");
			}
		}catch(SQLException sql) {
			throw sql;
		}catch(Exception ex) {
			throw ex;
		}finally {
			DBConnectionManager.closeResources(rs, ps, null);
		}
		return pnrNumber;
	}
}
