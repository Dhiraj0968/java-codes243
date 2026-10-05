class Calculator {

    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b )
    {
        return a+b;
    }
}
  class Student{
    String name;
    int age;
    Student(){
        name="unknown";
        age=0;
    }
    Student(String n,int a){
        name=n;
        age=a;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    void display()
    {
        System.out.println("name :"+name+",Age:"+age);
    }
    Student getStudent(){
        return this;
    }
  }
  
  public class FunctionDemo{
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        System.out.println("Add two int:"+calc.add(5, 10));
        System.out.println("Add three int:"+calc.add(34, 34,45));
        System.out.println("Add two double:"+calc.add(5.5, 10.10));

        Student s1=new Student();
        Student s2=new Student("patil",20);
        Student s3=new Student(s2);
        Student s4=s2.getStudent();
        System.out.println("student s4 details");
        s1.display();
        s2.display();
        s3.display();
        s4.display();

    }
  }
