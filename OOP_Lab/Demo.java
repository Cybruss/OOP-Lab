package assignment;

public class Demo {
    public static void main(String[] a){
        University university = new University();

        Lab lab1 = new Lab("Lab001");
        Lab lab2 = new Lab("Lab002");

        university.addLab(lab1);
        university.addLab(lab2);

        Employee labAttendant = new Employee("A001", "John Doe");
        lab1.setLabAttendant(labAttendant);

        Computer computer1 = new Computer("C001", "LCD Model 1", 8, 500, true);
        Computer computer2 = new Computer("C002", "LCD Model 2", 16, 1000, false);

        lab1.addComputer(computer1);
        lab2.addComputer(computer2);

    }
}
