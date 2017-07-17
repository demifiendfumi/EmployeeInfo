package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16022603 on 17/7/2017.
 */

public class InfoItem {
    private String name;
    private String job;
    private double wage;

    public InfoItem(String name, String job, double wage) {
        this.name = name;
        this.job = job;
        this.wage = wage;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getJob() {
        return job;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "InfoItem{" +
                "name='" + name + '\'' +
                ", job=" + job +
                ", wage="+ wage +
                '}';
    }
}
