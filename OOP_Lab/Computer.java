package assignment;

public class Computer {
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public Computer() {
        
    }

    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }


    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public String getComputerNumber(){
        return this.computerNumber;
    }
    public void setComputerNumber(String computerNumber){
        this.computerNumber=computerNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return computerNumber.equals(computer.computerNumber);
    }

    public Computer clone() {
        return new Computer(computerNumber, lcdModel, ramSize, hddSize, hasGPU);
    }

    
}
