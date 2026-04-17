package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="payment")
public class Payment
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name="booking_id")
    private Booking booking;

    private Double amount;

    private String paymentStatus;

    public Long getId() 
    {
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Booking getBooking() 
	{
		return booking;
	}

	public void setBooking(Booking booking) 
	{
		this.booking = booking;
	}

	public Double getAmount() 
	{
		return amount;
	}

	public void setAmount(Double amount) 
	{
		this.amount = amount;
	}

	public String getPaymentStatus() 
	{
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) 
	{
		this.paymentStatus = paymentStatus;
	}

}