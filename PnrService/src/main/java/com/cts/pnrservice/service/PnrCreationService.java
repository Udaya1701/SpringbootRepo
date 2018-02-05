package com.cts.pnrservice.service;

import java.sql.SQLException;

import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.CreatePnrRequest;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.SegmentInfo;

public interface PnrCreationService  {
	public String createPnr(CreatePnrRequest createPnr,DBProperties dbProperties) throws SQLException,Exception;
}
