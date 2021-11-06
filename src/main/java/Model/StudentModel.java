package Model;

import DatabaseConnection.DatabaseConnection;

import java.sql.PreparedStatement;
import Domain.Student;

public class StudentModel {
    private PreparedStatement ps;

    public Student registerStudent(Student student)throws ClassNotFoundException{
        String query="Insert into student(studentID,name,surname,department,email,phone_number)values(?,?,?,?,?,?)";

        try {
            ps= DatabaseConnection.getConnetion().prepareStatement(query);
            ps.setString(1,student.getStudentID());
            ps.setString(2,student.getName());
            ps.setString(3,student.getSurname());
            ps.setString(4,student.getDepartment());
            ps.setString(5,student.getEmail());
            ps.setString(6,student.getPhoneNumber());
            ps.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
            System.out.print(e);
        }finally {
            DatabaseConnection.closeAll(ps);
        }
        return student;

    }
}
