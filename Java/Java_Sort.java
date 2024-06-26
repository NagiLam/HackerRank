import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }
   
        Comparator<Student> studentComparator = new Comparator<Student>() {
            public int compare(Student st1, Student st2) {
                if ((st1.getCgpa() > st2.getCgpa())){
                    return -1;
                } 
                
                if ((st1.getCgpa() < st2.getCgpa())){
                    return 1;
                } 
                
                if (!(st1.getFname().equals(st2.getFname()))){
                    return st1.getFname().compareTo(st2.getFname());
                } 
                return st1.getId() - st2.getId();
        
            }
        };
        Collections.sort(studentList, studentComparator);
        
        for (Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



