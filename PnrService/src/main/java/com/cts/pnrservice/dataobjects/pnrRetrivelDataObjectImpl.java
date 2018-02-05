package com.cts.pnrservice.dataobjects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.pnrservice.constants.QueryConstants;
import com.cts.pnrservice.manager.DBConnectionManager;
import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.PassengerInfoInner;
import com.cts.pnrservice.model.SegmentInfo;
import com.cts.pnrservice.model.SegmentInfoInner;
import com.cts.pnrservice.utils.DateUtils;

public class pnrRetrivelDataObjectImpl implements pnrRetrivelDataObject {

	@Override
	public SegmentInfo retrievePnrDetails(String pnrNum,DBProperties dbProperties) throws SQLException, Exception {
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		String query ="";
		SegmentInfo segInfo = new SegmentInfo();
		SegmentInfoInner segInnerInfo = null;
		try {
			con = DBConnectionManager.getInsatnce().getConnection(dbProperties);
			query = QueryConstants.QUERY_GET_PNR_DETAILS;
			ps = con.prepareStatement(query);
			ps.setString(1, pnrNum);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				segInnerInfo = new SegmentInfoInner();
				
				segInnerInfo.setArrivalCode(rs.getString("ArrivalCode"));
				segInnerInfo.setArrivalPoint(rs.getString("ArrivalPoint"));
				segInnerInfo.setClassOfService(rs.getString("ClassOfService"));
				segInnerInfo.setDate(DateUtils.getDateStringMMDDYYYY(rs.getDate("Date")));
				segInnerInfo.setDeparturePoint(rs.getString("DeparturePoint"));
				segInnerInfo.setFlightNumber(rs.getString("FlightNumber"));
				
				segInfo.add(segInnerInfo);
			}
			if(segInnerInfo == null) {
				segInnerInfo = new SegmentInfoInner();
				
				segInnerInfo.setArrivalCode("No Data Found");
				segInnerInfo.setArrivalPoint("No Data Found");
				segInnerInfo.setClassOfService("No Data Found");
				segInnerInfo.setDate("No Data Found");
				segInnerInfo.setDeparturePoint("No Data Found");
				segInnerInfo.setFlightNumber("No Data Found");
				
				segInfo.add(segInnerInfo);
			}
		}catch(SQLException sql) {
			throw sql;
		}catch(Exception ex) {
			throw ex;
		}finally {
			DBConnectionManager.closeResources(rs, ps, con);
		}
		
		return segInfo;
	}

	@Override
	public PassengerInfo retrievePassengerDetails(String pnrNum,DBProperties dbProperties) throws SQLException, Exception {
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		String query ="";
		PassengerInfo pssInfo = new PassengerInfo();
		PassengerInfoInner passInnerInfo = null;
		try {
			con = DBConnectionManager.getInsatnce().getConnection(dbProperties);
			
			query = QueryConstants.QUERY_GET_PASSENGER_DETAILS;
			ps = con.prepareStatement(query);
			ps.setString(1, pnrNum);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				passInnerInfo = new PassengerInfoInner();
				
				passInnerInfo.setFirstName(rs.getString("FirstName"));
				passInnerInfo.setLastName(rs.getString("LastName"));
				passInnerInfo.setPhoneNumber(rs.getString("PhoneNumber"));
				passInnerInfo.setCustomerId("");
				
				pssInfo.add(passInnerInfo);
			}
			
			if(passInnerInfo == null) {
				passInnerInfo = new PassengerInfoInner();
				
				passInnerInfo.setFirstName("No Data Found");
				passInnerInfo.setLastName("No Data Found");
				passInnerInfo.setPhoneNumber("No Data Found");
				passInnerInfo.customerId("No Data Found");
				
				pssInfo.add(passInnerInfo);
			}
		}catch(SQLException sql) {
			throw sql;
		}catch(Exception ex) {
			throw ex;
		}finally {
			DBConnectionManager.closeResources(null, ps, con);
		}
		return pssInfo;
	}

}
