package ProgrammingExam2;

import java.time.LocalDate;

public class Noob extends Users{
    
    private int range;
    
    public Noob(){
        setName("");
        setUserName("");
        setPassword("");
        setDate(date.now());
        setRange(0);
    }
    
    public Noob(String na, String uN, String pa, LocalDate da, int r, Veteran promotion){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da);
        setRange(r);
        if(range==30){
            Users a=new Noob();
            a=new Veteran();
            a=promotion;
        }
        
    }
    
    public Noob(String na, String uN, String pa, LocalDate da, int r){
        setName(na);
        setUserName(uN);
        setPassword(pa);
        setDate(da.now());
        setRange(r);
    }
    
    public Noob(Noob other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        setRange(other.getRange());
    }
    
    public void setRange(int r){
        if(r>=0 && r<=30){
            range=r;
        }
    }
    
    public int getRange(){
        return range;
    }
    
    public String toString(){
        return "The noob " + getName() + " with username: " + getUserName() + " was log the account at: " + getDate() + ", have a range of " + getRange() + " days. His password is: " + getPassword();
    }
    
    public Noob clone(Noob other){
        setName(other.getName());
        setUserName(other.getUserName());
        setPassword(other.getPassword());
        setDate(other.getDate());
        setRange(other.getRange());
        return other;
    }
    
    public boolean equals(Noob other){
        boolean comp=false;
        
        if(getName()==other.getName()){
            if(getUserName()==other.getUserName()){
                if(getPassword()==other.getPassword()){
                    if(getDate()==other.getDate()){
                        if(getRange()==other.getRange()){
                            comp=true;
                        }
                    }
                }
            }
        }
        
        return comp;
    }
}
