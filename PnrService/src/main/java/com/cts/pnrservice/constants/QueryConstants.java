package com.cts.pnrservice.constants;

public class QueryConstants {
	public static final String QUERY_INSERT_PNR_DETAILS ="INSERT INTO PnrJDBCSR.pnrdetails value(?, ?, ?, ?, ?, ?, ?)";
	public static final String QUERY_INSERT_PASSENGERS_DETAILS ="INSERT INTO PnrJDBCSR.passengerdetails value(?, ?, ?, ?)";
	public static final String QUERY_GET_MAX_PNR_NUMBER ="SELECT LPAD(IFNULL(MAX(CAST(PNRNumber AS UNSIGNED)), 0)+1, 5, '0') as maxPnr FROM PnrJDBCSR.pnrdetails";
	
	public static final String QUERY_GET_PNR_DETAILS ="select pnrDtls.PNRNumber, pnrDtls.ArrivalCode, pnrDtls.ArrivalPoint, pnrDtls.ClassOfService, pnrDtls.Date, pnrDtls.DeparturePoint, pnrDtls.FlightNumber from PnrJDBCSR.pnrdetails pnrDtls where pnrDtls.PNRNumber = ?";
	public static final String QUERY_GET_PASSENGER_DETAILS ="select psngrDtls.FirstName, psngrDtls.LastName, psngrDtls.PhoneNumber from PnrJDBCSR.passengerdetails psngrDtls where PNRNumber = ?";
}
