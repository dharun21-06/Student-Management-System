package bean;


import java.util.Arrays;

public class Student {
    long rollNo;
    String name;
    String address;
    String subject;
    Integer[] marks;

    public Student() {
    }

    public Student(long rollNo, String name, String address, String subject, Integer[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.marks = marks;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    public Integer[] getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = new Integer[]{marks};
    }

    public double getAverage()
    {
        int s = 0;
        for(int m : marks){
            s+=m;
        }

        return s/6.0;
    }

    @Override
    public String toString() {
        String s = "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ",Average = " + getAverage() +
                '}';
        return s;
    }





}
