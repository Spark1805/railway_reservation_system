package com.prnv.jfsd.trs.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService
{

    public double paymentCharge(String method)
    {

        if(method.equals("UPI"))
            return 20;

        return 25;

    }

}