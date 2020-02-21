import java.util.Scanner;
import java.util.ArrayList;
public class Edit_and_remove{
    public static int searchbyID(int IDsearch,ArrayList<Student> mylist){
        int i=0;
        while(i<mylist.size()){
            if(mylist.get(i).getID()==IDsearch){
                return i;
            }
            else ++i;
        }
        System.out.println("ID cant find in this list student.");
        return -1;
    }
    public static void removebyID(int IDremove,ArrayList<Student> mylist){
        if(searchbyID(IDremove, mylist)!=-1){
            mylist.remove(searchbyID(IDremove, mylist));
        }
    }
    public static void editbyID(int IDedit,ArrayList<Student> mylist){
        int index=searchbyID(IDedit, mylist);
        if(index!=-1){
            System.out.println("Sua thong tin sinh vien co ID "+IDedit);
            Scanner sc=new Scanner(System.in);
            System.out.println("Ten sinh vien: ");
            mylist.get(index).setname(sc.nextLine());
            System.out.println("Tuoi sinh vien: ");
            mylist.get(index).setage(sc.nextInt());
            sc.nextLine();
            System.out.println("Dia chi sinh vien: ");
            mylist.get(index).setaddress(sc.nextLine());
            System.out.println("GPA sinh vien: ");
            mylist.get(index).setGPA(sc.nextDouble());
        }

    }
}