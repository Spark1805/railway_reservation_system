package com.prnv.jfsd.trs.dto;

import java.util.List;

public class BookingRequest
{

    private Long userId;
    private Long scheduleId;
    private String coachType;
    private String paymentMethod;

    private List<PassengerDTO> passengers;

    public Long getUserId() 
    { 
    	return userId; 
    }
    
    public void setUserId(Long userId) 
    { 
    	this.userId = userId; 
    }

    public Long getScheduleId() 
    { 
    	return scheduleId;
    }
    
    public void setScheduleId(Long scheduleId) 
    { 
    	this.scheduleId = scheduleId; 
    }

    public String getCoachType() 
    { 
    	return coachType; 
    }
    public void setCoachType(String coachType) 
    { 
    	this.coachType = coachType; 
    }

    public String getPaymentMethod() 
    { 
    	return paymentMethod; 
    }
    
    public void setPaymentMethod(String paymentMethod) 
    { 
    	this.paymentMethod = paymentMethod; 
    }

    public List<PassengerDTO> getPassengers() 
    { 
    	return passengers; 
    }
    public void setPassengers(List<PassengerDTO> passengers) 
    { 
    	this.passengers = passengers; 
    }

}