package Exercises1_2;

import ProgrammingExam2.*;
import java.time.LocalDate;

public class Users {

    String name;
    
    private String userName, password;
    protected LocalDate date;
    
    public Users(){
        name="";
        userName="";
        password="";
        date=date.now();
    }
    
    public Users(String na, String uN, String pa, LocalDate da){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da);
    }
    
    public Users(Users other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
    }
    
    public void setName(String na){
        na.trim();
        if(na.length()>=10){
            name=na;
        }
    }
    
    public void setUserName(String uN){
        uN.toLowerCase();
        if(uN.length()>=6){
            userName=uN;
        }
    }
    
    public void setPassword(String pa){
        if(pa.length()>=8 && pa.contains(pa.toLowerCase()) && pa.contains(pa.toUpperCase())){
            password=pa;
        }
    }
    
    public void setDate(LocalDate a){
        date.of(2020, 01, 01);
        if(a.isAfter(date)){
            date=a;
        }
    }
    
    public final String getName(){
        return name;
    }
    
    public final String getUserName(){
        return userName;
    }
    
    public final String getPassword(){
        return password;
    }
    
    public final LocalDate getDate(){
        return date;
    }
    
    public String toString(){
        return "The user " + getName() + " with username: " + getUserName() + " was log the account at: " + getDate() + ". His password is: " + getPassword();
    }
    
    public Users clone(Users other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        return other;
    }
    
    public boolean equals(Users other){
        boolean comp=false;
        
        if(getName()==other.getName()){
            if(getUserName()==other.getUserName()){
                if(getPassword()==other.getPassword()){
                    if(getDate()==other.getDate()){
                        comp=true;
                    }
                }
            }
        }
        
        return comp;
    }
}
