package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="passenger")
public class Passenger
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String gender;

    private String foodPreference;

    public Long getId()
    {
        return id;
    }

    public void setId(Long a)
    {
        id = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String a)
    {
        name = a;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer a)
    {
        age = a;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String a)
    {
        gender = a;
    }

    public String getFoodPreference()
    {
        return foodPreference;
    }

    public void setFoodPreference(String a)
    {
        foodPreference = a;
    }

}