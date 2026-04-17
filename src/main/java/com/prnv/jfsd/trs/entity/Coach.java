package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="coach")
public class Coach
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="coach_number")
    private String coachNumber;

    @Column(name="coach_type")
    private String coachType;

    @Column(name="total_seats")
    private int totalSeats;

    @ManyToOne
    @JoinColumn(name="train_id")
    private Train train;

    @OneToMany(mappedBy="coach")
    private List<Seat> seats;

    public Coach()
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

    public String getCoachNumber()
    {
        return coachNumber;
    }

    public void setCoachNumber(String coachNumber)
    {
        this.coachNumber = coachNumber;
    }

    public String getCoachType()
    {
        return coachType;
    }

    public void setCoachType(String coachType)
    {
        this.coachType = coachType;
    }

    public int getTotalSeats()
    {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats)
    {
        this.totalSeats = totalSeats;
    }

    public Train getTrain()
    {
        return train;
    }

    public void setTrain(Train train)
    {
        this.train = train;
    }

    public List<Seat> getSeats()
    {
        return seats;
    }

    public void setSeats(List<Seat> seats)
    {
        this.seats = seats;
    }

}