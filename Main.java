
public class Main {
    public static void main(String[] args) {

    
        
       
      ServiceImpl ob=new ServiceImpl();
 
 
Student s1=new Student("suresh", "pro",13);
      ob.insertStudent(s1);
      System.out.println(ob.getAllStudents());
}
}