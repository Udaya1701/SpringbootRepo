package com.cts.pnrservice.service;

import java.sql.SQLException;

import com.cts.pnrservice.dataobjects.pnrCreationDataObjectImpl;
import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.CreatePnrRequest;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.SegmentInfo;

public class pnrCreationServiceImpl implements PnrCreationService {

	@Override
	public String createPnr(CreatePnrRequest createPnr,DBProperties dbProperties) throws SQLException,Exception {
		
		return new pnrCreationDataObjectImpl().createPnr(createPnr,dbProperties);
	}
}
