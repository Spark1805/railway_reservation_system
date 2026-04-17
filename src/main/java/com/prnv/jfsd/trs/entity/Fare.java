package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fare")
public class Fare
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "train_id", nullable = false)
    private Train train;

    @Column(name = "coach_type")
    private String coachType;

    @Column(name = "amount")
    private Double amount;

    public Fare()
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

    public Train getTrain()
    {
        return train;
    }

    public void setTrain(Train train)
    {
        this.train = train;
    }

    public String getCoachType()
    {
        return coachType;
    }

    public void setCoachType(String coachType)
    {
        this.coachType = coachType;
    }

    public Double getAmount()
    {
        return amount;
    }

    public void setAmount(Double amount)
    {
        this.amount = amount;
    }
}