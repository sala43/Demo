import java.util.List;

interface Service{
    
    public List<Student> getAllStudents();
    public Student getStudent(Student std);
    public void insertStudent(Student std);
    public void updateStudent(Student std);
    public void deleteStudent(Student std);

}
