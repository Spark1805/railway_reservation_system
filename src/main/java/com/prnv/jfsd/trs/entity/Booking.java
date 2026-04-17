package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="booking")
public class Booking
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="passenger_id")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name="seat_id")
    private Seat seat;
    
    @ManyToOne
    @JoinColumn(name="train_id")
    private Train train;

    private String bookingStatus;
    
    public Long getId() 
    {
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Passenger getPassenger() 
	{
		return passenger;
	}

	public void setPassenger(Passenger passenger) 
	{
		this.passenger = passenger;
	}

	public Seat getSeat() 
	{
		return seat;
	}

	public void setSeat(Seat seat) 
	{
		this.seat = seat;
	}

	public Train getTrain() 
	{
		return train;
	}

	public void setTrain(Train train) 
	{
		this.train = train;
	}

	public String getBookingStatus() 
	{
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) 
	{
		this.bookingStatus = bookingStatus;
	}

}