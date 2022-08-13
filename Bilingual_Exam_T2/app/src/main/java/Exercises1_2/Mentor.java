package Exercises1_2;

import ProgrammingExam2.*;
import java.time.LocalDate;

public class Mentor extends Users{
    
    private String status;
    private int range;
    
    public Mentor(){
        setName("");
        setUserName("");
        setPassword("");
        setDate(date.now());
        setRange(0);
        setStatus("");
    }
    
    public Mentor(String na, String uN, String pa, LocalDate da, int r, String st, Mentor promotion){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da);
        setRange(r);
        setStatus(st);
    }
    
    public Mentor(String na, String uN, String pa, LocalDate da, int r, String st){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da.now());
        setRange(r);
        setStatus(st);
    }
    
    public Mentor(Mentor other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        setRange(other.getRange());
        setStatus(other.getStatus());
    }
    
    public void setRange(int r){
        if(r>120){
            range=r;
        }
    }
    
    private int getRange(){
        return range;
    }
    
    public void setStatus(String st){
        status=st;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String toString(){
        return "The mentor " + getName() + " with username: " + getUserName() + " was log the account at: " + getDate() + ", have a range of " + getRange() + " days. Show status: " + getStatus() + "His password is: " + getPassword();
    }
    
    public Mentor clone(Mentor other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        setRange(other.getRange());
        setStatus(other.getStatus());
        return other;
    }
    
    public boolean equals(Mentor other){
        boolean comp=false;
        
        if(getName()==other.getName()){
            if(getUserName()==other.getUserName()){
                if(getPassword()==other.getPassword()){
                    if(getDate()==other.getDate()){
                        if(getRange()==other.getRange()){
                            if(getStatus()==other.getStatus()){
                                comp=true;
                            }
                        }
                    }
                }
            }
        }
        
        return comp;
    }
}
