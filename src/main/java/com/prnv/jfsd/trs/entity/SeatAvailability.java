package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seat_availability")
public class SeatAvailability
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schedule_id", nullable = false)
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    @Column(name = "booked")
    private boolean booked;

    public SeatAvailability()
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

    public Schedule getSchedule()
    {
        return schedule;
    }

    public void setSchedule(Schedule schedule)
    {
        this.schedule = schedule;
    }

    public Seat getSeat()
    {
        return seat;
    }

    public void setSeat(Seat seat)
    {
        this.seat = seat;
    }

    public boolean isBooked()
    {
        return booked;
    }

    public void setBooked(boolean booked)
    {
        this.booked = booked;
    }
}