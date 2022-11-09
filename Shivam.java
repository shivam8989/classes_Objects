package Pratice;
import java.util.Scanner;
class Student  {
    String name;
    int id;
   static String collagename;

    public void input() {
        System.out.println("The name of the student " +name);
        System.out.println("The id of stufent "+ id);
        System.out.println( "The collage name " +collagename);
    }
}
class MarkSheet extends Student{

     static int s1 ,s2,s3;
  static int marks;
    void output(){
        System.out.println("The % of Student "+marks);
    }
}
public class Shivam {
    public static void main(String[] args) {
        MarkSheet syed = new MarkSheet();
        syed.name = "Shivam singh";
        syed.id = 2100380;
        Student.collagename = "GNIOT";
        MarkSheet.s1= 56;
        MarkSheet.s2 = 78;
        MarkSheet.s3 = 79;
        MarkSheet.marks = ( MarkSheet.s1+
        MarkSheet.s2 +
        MarkSheet.s3)/3  ;

        syed.input();
        syed.output();

    }
}
