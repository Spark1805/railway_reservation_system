package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="ticket")
public class Ticket
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Schedule schedule;

    private String coachName;

    private String coachType;

    private LocalDate travelDate;

    private String seatNumber;

    private String status;

    private String bookingStatus;

    private String pnrNumber;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Passenger getPassenger()
    {
        return passenger;
    }

    public void setPassenger(Passenger passenger)
    {
        this.passenger = passenger;
    }

    public Schedule getSchedule()
    {
        return schedule;
    }

    public void setSchedule(Schedule schedule)
    {
        this.schedule = schedule;
    }

    public String getCoachName()
    {
        return coachName;
    }

    public void setCoachName(String coachName)
    {
        this.coachName = coachName;
    }

    public String getCoachType()
    {
        return coachType;
    }

    public void setCoachType(String coachType)
    {
        this.coachType = coachType;
    }

    public LocalDate getTravelDate()
    {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate)
    {
        this.travelDate = travelDate;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getBookingStatus()
    {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus)
    {
        this.bookingStatus = bookingStatus;
    }

    public String getPnrNumber()
    {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber)
    {
        this.pnrNumber = pnrNumber;
    }

}