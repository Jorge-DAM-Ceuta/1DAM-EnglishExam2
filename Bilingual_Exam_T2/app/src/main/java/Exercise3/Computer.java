package Exercise3;

public class Computer {
    
    private int CPUCores, PowerCapacity;
    private double CPUFrequency, RAMSize, StorageCapacity;
            
    public Computer(){
        setCPUCores(0);
        setCPUFrequency(0);
        setRAMSize(0);
        setStorageCapacity(0);
        setPowerCapacity(0);
    }
    
    public Computer(int CPUC, int PC, double CPUF, double RAMS, double SC){
        setCPUCores(CPUC);
        setCPUFrequency(CPUF);
        setRAMSize(RAMS);
        setStorageCapacity(SC);
        setPowerCapacity(PC);
    }
    
    public Computer(int CPUC, int PC, double CPUF, double RAMS, double SC, GraphicCard a){
        setCPUCores(CPUC);
        setCPUFrequency(CPUF);
        setRAMSize(RAMS);
        setStorageCapacity(SC);
        setPowerCapacity(PC);
        a=new GraphicCard();
    }
    
    public Computer(Computer other){
        setCPUCores(other.getCPUCores());
        setCPUFrequency(other.getCPUFrequency());
        setRAMSize(other.getRAMSize());
        setStorageCapacity(other.getStorageCapacity());
        setPowerCapacity(other.getPowerCapacity());
    }
    
    public void setCPUCores(int CPUC){
        if(CPUC>1 && CPUC<=16){
            CPUCores=CPUC;
        }
    }
    
    public void setCPUFrequency(double CPUF){
        if(CPUF<=5.5){
            CPUFrequency=CPUF;
        }
    }
    
    public void setRAMSize(double RAMS){
        if(RAMS<32 && RAMS>0){
            RAMSize=RAMS;
        }
    }
    
    public void setStorageCapacity(double SC){
        if(SC<=16024 && SC>0){
            StorageCapacity=SC;
        }
    }
    
    public void setPowerCapacity(int PC){
        if(PC<1000 && PC>0){
            PowerCapacity=PC;
        }
    }
    
    public int getCPUCores(){
        return CPUCores;
    }
    
    public int getPowerCapacity(){
        return PowerCapacity;
    }
    
    public double getCPUFrequency(){
        return CPUFrequency;
    }
    
    public double getRAMSize(){
        return RAMSize;
    }
    
    public double getStorageCapacity(){
        return StorageCapacity;
    }
    
    public String toString(){
        return "This computer have: " + getCPUCores() + " number of cores, " + getCPUFrequency() + " frequency, " + getRAMSize() + " RAM size, " + getStorageCapacity() + " and Storage capacity, " + getPowerCapacity();
    }
    
    public Computer clone(Computer other){
        setCPUCores(other.getCPUCores());
        setCPUFrequency(other.getCPUFrequency());
        setRAMSize(other.getRAMSize());
        setStorageCapacity(other.getStorageCapacity());
        setPowerCapacity(other.getPowerCapacity());
        return other;
    }
    
    public boolean equals(Computer other){
        boolean comp=false;
        
        if(getCPUCores()==other.getCPUCores()){
            if(getCPUFrequency()==other.getCPUFrequency()){
                if(getRAMSize()==other.getRAMSize()){
                    if(getStorageCapacity()==other.getStorageCapacity()){
                        if(getPowerCapacity()==other.getPowerCapacity()){
                            comp=true;
                        }
                    }
                }
            }
        }
        
        return comp;
    }
}
