package com.cts.pnrservice.dataobjects;

import java.sql.SQLException;

import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.CreatePnrRequest;

public interface pnrCreationDataObject {
	public String createPnr(CreatePnrRequest createPnr,DBProperties dbProperties) throws SQLException,Exception;
}
