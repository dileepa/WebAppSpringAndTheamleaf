package com.dileepa.domain;

/**
 * USER : Dileepa
 * DATE : 4/26/15
 * TIME : 12:43 PM
 */
public class PersonBean
{
    private int id;
    private String name;
    private int age;
    private String city;
    private String Job;


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }
}
