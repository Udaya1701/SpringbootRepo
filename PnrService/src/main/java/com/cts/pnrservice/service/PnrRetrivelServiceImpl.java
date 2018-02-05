package com.cts.pnrservice.service;

import java.sql.SQLException;

import com.cts.pnrservice.dataobjects.pnrRetrivelDataObjectImpl;
import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.SegmentInfo;

public class PnrRetrivelServiceImpl implements PnrRetrivelService {

	@Override
	public SegmentInfo retrievePnrDetails(String pnrNum,DBProperties dbProperties) throws SQLException, Exception {
		
		return new pnrRetrivelDataObjectImpl().retrievePnrDetails(pnrNum,dbProperties);
	}

	@Override
	public PassengerInfo retrievePassengerDetails(String pnrNum,DBProperties dbProperties) throws SQLException, Exception {
		
		return new pnrRetrivelDataObjectImpl().retrievePassengerDetails(pnrNum,dbProperties);
	}
	
}
