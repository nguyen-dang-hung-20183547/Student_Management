import java.util.Scanner;
public class NewStudent{
    public static Student newStudent(){
        Student newSD=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("ID sinh vien: ");
        newSD.setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Ten sinh vien: ");
        newSD.setname(sc.nextLine());
        System.out.println("Tuoi sinh vien: ");
        newSD.setage(sc.nextInt());
        sc.nextLine();
        System.out.println("Dia chi sinh vien: ");
        newSD.setaddress(sc.nextLine());
        System.out.println("GPA sinh vien: ");
        newSD.setGPA(sc.nextDouble());
        return newSD;
    }
}