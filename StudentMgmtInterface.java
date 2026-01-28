package utility;

import bean.Student;
import exception.StudentDoesntExist;

public interface StudentMgmtInterface {
    abstract boolean addStudent(Student s);
    abstract boolean deleteStudent(long rollNo) throws StudentDoesntExist;
    abstract void listStudents();
    abstract boolean updateStudent(long rollNo,Student std) throws StudentDoesntExist;
    abstract void findTopper();
}
