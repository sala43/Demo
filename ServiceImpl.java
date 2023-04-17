
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {

     List<Student> list ;

     

    public ServiceImpl() {
        
        list=new ArrayList<Student>(); 
        Student s1 = new Student("sala", " sala", 22);
        Student s2 = new Student("jeya", " chandran", 28);
        Student s3 = new Student("Thiyagu", " S", 24);
        Student s4 = new Student("Anoooop", " Thambiiii", 240);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
    }

    @Override
    public List<Student> getAllStudents() {
       
        return list;
    }

    @Override
    public Student getStudent(Student std) {
       
        throw new UnsupportedOperationException("Unimplemented method 'getStudent'");
    }

    @Override
    public void insertStudent(Student std) {
       list.add(std);
       
  System.out.println("inserted... ");

    }

    @Override
    public void updateStudent(Student std) {
      list.add(std);
    }

    @Override
    public void deleteStudent(Student std) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
       list.remove(std);
       System.out.println("deleted... ");

    }

}
