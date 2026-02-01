package utility;

import bean.Student;
import exception.StudentDoesntExist;

public interface StudentMgmtInterface {
     boolean addStudent(Student s);
     boolean deleteStudent(long rollNo) throws StudentDoesntExist;
    void listStudents();
    boolean updateStudent(long rollNo,Student std) throws StudentDoesntExist;
    void findTopper();
}

