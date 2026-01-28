package service;

import bean.Student;
import exception.StudentDoesntExist;
import utility.StudentMgmtInterface;

import java.util.ArrayList;

import static java.lang.System.*;

public class StudentManagementSystem implements StudentMgmtInterface {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    @Override
    public boolean addStudent(Student s) {
        if(studentArrayList.size()>10){
            return false;
        }

        else{
            studentArrayList.add(s);
            return true;
        }
    }

    @Override
    public boolean deleteStudent(long rollNo) throws StudentDoesntExist {
        for(Student s : studentArrayList)
        {
            if(s.getRollNo()==rollNo){
                studentArrayList.remove(s);
                return true;
            }
        }

        throw new StudentDoesntExist("Student does not exist");
    }

    @Override
    public void listStudents() {
        if(!studentArrayList.isEmpty()){
            for(Student k : studentArrayList){
                System.out.println(k);
            }
        }
        else{
            out.println("Student List is Empty!!!");
        }

    }

    @Override
    public boolean updateStudent(long rollNo, Student std) throws StudentDoesntExist {
        for(int i=0;i<6;i++)
        {
            if(studentArrayList.get(i).getRollNo() == rollNo){
                studentArrayList.set(i,std);
                return true;
            }
        }
        throw new StudentDoesntExist("Student Roll no does not Exist");

    }

    @Override
    public void findTopper() {
        Student topper_Student = null;
        double highAvg = 0;
        for(Student s : studentArrayList)
        {
            if(s.getAverage()>highAvg){
                highAvg = s.getAverage();
                topper_Student = s;
            }
        }
        out.println(topper_Student);

    }
}
