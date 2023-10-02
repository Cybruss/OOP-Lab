package assignment;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;
    private int maxComputers=50;

    public Lab() {
        
    }

    public Lab(String labID) {
        this.labID = labID;
        this.computers = new Computer[maxComputers];
    }

    public void addComputer(Computer computer) {
        for(int i=0;i<maxComputers;i++){
            if(computers[i]==null)
                computers[i]=computer;
        }
    }

    public void removeComputer(Computer computer) {
       for(int i=0;i<maxComputers;i++){
            if(computers[i]==computer){
                for(int j=i;j<maxComputers;j++){
                    computers[j]=computers[j+1]
                }
                computers[maxComputers-1]
            }
        }
    }
    public Computer[] getComputers() {
        return computers;
    }

    
    public void changeStatus(LabStatus status) {
        this.status = status;
    }

    
    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }
}
