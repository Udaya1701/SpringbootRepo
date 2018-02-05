package com.cts.pnrservice.api;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.pnrservice.manager.DBProperties;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.PassengerInfoInner;
import com.cts.pnrservice.model.RetrievePnrResponse;
import com.cts.pnrservice.model.SegmentInfo;
import com.cts.pnrservice.model.SegmentInfoInner;
import com.cts.pnrservice.service.PnrRetrivelServiceImpl;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

@Controller
public class RetrievePnrApiController implements RetrievePnrApi {


@Autowired
private DBProperties dbProperties;
    public ResponseEntity<RetrievePnrResponse> retrievePnr( @NotNull@ApiParam(value = "PnrNo", required = true) @RequestParam(value = "PnrNo", required = true) String pnrNo) {
    	System.out.println("Printing DB Values");
    	System.out.println("Host:"+dbProperties.getHost() + " Port: " + dbProperties.getPort()+ " Name: "+dbProperties.getName()+" UserName:"+dbProperties.getUsername()+" Password:"+dbProperties.getPassword());
    	RetrievePnrResponse responce = new RetrievePnrResponse();
    	 
    	PassengerInfo pssInfoFrError = new PassengerInfo();
		PassengerInfoInner passInnerInfoFrError = null;
		
		SegmentInfo segInfoFrError = new SegmentInfo();
		SegmentInfoInner segInnerInfoFrError = null;
    	try {
    		SegmentInfo segInfo = new SegmentInfo();
    		PassengerInfo passInfo = new PassengerInfo();
    		
        	segInfo = new PnrRetrivelServiceImpl().retrievePnrDetails(pnrNo,dbProperties);
        	passInfo = new PnrRetrivelServiceImpl().retrievePassengerDetails(pnrNo,dbProperties);
        	
        	if(segInfo != null && passInfo != null) {
        		responce.segmentInfo(segInfo);
        		responce.setPassengerInfo(passInfo);
        	}else {
        		responce = new RetrievePnrResponse();
        	}
        }catch(Exception ex) {
        	System.out.println(ex); 
        	responce = new RetrievePnrResponse();
        	
        	segInnerInfoFrError = new SegmentInfoInner();
			
        	segInnerInfoFrError.setArrivalCode("No Data Found");
        	segInnerInfoFrError.setArrivalPoint("No Data Found");
        	segInnerInfoFrError.setClassOfService("No Data Found");
        	segInnerInfoFrError.setDate("No Data Found");
        	segInnerInfoFrError.setDeparturePoint("No Data Found");
        	segInnerInfoFrError.setFlightNumber("No Data Found");
			
        	segInfoFrError.add(segInnerInfoFrError);
        	
        	passInnerInfoFrError = new PassengerInfoInner();
			
        	passInnerInfoFrError.setFirstName("No Data Found");
        	passInnerInfoFrError.setLastName("No Data Found");
        	passInnerInfoFrError.setPhoneNumber("No Data Found");
        	passInnerInfoFrError.setCustomerId("No Data Found");
			
        	pssInfoFrError.add(passInnerInfoFrError);
        	
        	responce.setPassengerInfo(pssInfoFrError);
        	responce.setSegmentInfo(segInfoFrError); 
		}
    	
        return new ResponseEntity<RetrievePnrResponse>(responce, HttpStatus.OK);
    }

}
