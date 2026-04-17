package com.prnv.jfsd.trs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="meal_order")
public class MealOrder
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private double price;

    @ManyToOne
    @JoinColumn(name="ticket_id")
    private Ticket ticket;

    public Long getId() 
    {
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getItemName() 
	{
		return itemName;
	}

	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public Ticket getTicket() 
	{
		return ticket;
	}

	public void setTicket(Ticket ticket) 
	{
		this.ticket = ticket;
	}
	
}