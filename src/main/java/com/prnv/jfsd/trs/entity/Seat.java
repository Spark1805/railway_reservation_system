package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="seat")
public class Seat
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="seat_number")
    private String seatNumber;

    @Column(name="seat_type")
    private String seatType;

    @ManyToOne
    @JoinColumn(name="coach_id")
    private Coach coach;

    public Seat()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getSeatType()
    {
        return seatType;
    }

    public void setSeatType(String seatType)
    {
        this.seatType = seatType;
    }

    public Coach getCoach()
    {
        return coach;
    }

    public void setCoach(Coach coach)
    {
        this.coach = coach;
    }

}