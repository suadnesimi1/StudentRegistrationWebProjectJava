package Service;

import Domain.Student;
import Model.StudentModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/registerStudent")
public class StudentService extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StudentModel studentModel = new StudentModel();

    public StudentService() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

        RequestDispatcher dispatcher= request.getRequestDispatcher("/webapp/studentregister.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        String studentID = request.getParameter("studentID");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String department = request.getParameter("department");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");

        Student student = new Student();
        student.setStudentID(studentID);
        student.setName(name);
        student.setSurname(surname);
        student.setDepartment(department);
        student.setEmail(email);
        student.setPhoneNumber(phoneNumber);

        try {
            StudentModel studentRepo = new StudentModel();
            studentRepo.registerStudent(student);


        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher= request.getRequestDispatcher("/webapp/studentdetails.jsp");
        dispatcher.forward(request,response);

    }
}
