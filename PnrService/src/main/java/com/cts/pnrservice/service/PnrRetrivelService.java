package com.cts.pnrservice.service;

import java.sql.SQLException;

import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.SegmentInfo;

public interface PnrRetrivelService {
	public SegmentInfo retrievePnrDetails(String pnrNum,DBProperties dbProperties) throws SQLException,Exception;
	public PassengerInfo retrievePassengerDetails(String pnrNum,DBProperties dbProperties) throws SQLException,Exception;
}
