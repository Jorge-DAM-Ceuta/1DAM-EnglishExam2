package ProgrammingExam2;

import java.time.LocalDate;

public class Veteran extends Users{
    
    private String status;
    private int range;
    
    public Veteran(){
        setName("");
        setUserName("");
        setPassword("");
        setDate(date.now());
        setRange(0);
        setStatus("");
    }
    
    public Veteran(String na, String uN, String pa, LocalDate da, int r, String st, Mentor promotion){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da);
        setRange(r);
        if(range==120){
            Users a=new Veteran();
            a=new Mentor();
            a=promotion;
        }
        setStatus(st);
    }
    
    public Veteran(String na, String uN, String pa, LocalDate da, int r, String st){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da.now());
        setRange(r);
        setStatus(st);
    }
    
    public Veteran(Veteran other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        setRange(other.getRange());
        setStatus(other.getStatus());
    }
    
    public void setRange(int r){
        if(r>30 && r<=120){
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
        return "The veteran " + getName() + " with username: " + getUserName() + " was log the account at: " + getDate() + ", have a range of " + getRange() + " days. Show status: " + getStatus() + "His password is: " + getPassword();
    }
    
    public Veteran clone(Veteran other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        setRange(other.getRange());
        setStatus(other.getStatus());
        return other;
    }
    
    public boolean equals(Veteran other){
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
