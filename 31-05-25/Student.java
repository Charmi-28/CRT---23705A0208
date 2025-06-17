public class Main{
    public static void main(String[]args){
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.attendence());
        System.out.println(s1.branch);
        s1.payfee (70000);
    }
}
public class Student{
    String name = "Charmi";
    String roll = "23705A0208";
    String branch = "EEE";
    byte year = 3 ;
    char section = 'b';
    void payfee(int amount){
        System.out.println("paying:" +amount+ "to the college");
    }
    int attendence(){
        System.out.println("sending the attendence to the student");
        return(80);
    }
}
    