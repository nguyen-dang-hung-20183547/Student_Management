import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class StudentMNG{
    public static void main(String[] args){
        ArrayList<Student> mylist=new ArrayList<Student>();
        Scanner sc=new Scanner(System.in);
        int Case;
        while(1<2){
            System.out.println("-----------------Main Menu--------------- \n1.Add Student           2.Edit by ID            3.Remove by ID\n4.Sort by GPA           5.Sort by name          6.Show Student\n0.Exit\nMoi nhap menu task: ");
            Case=sc.nextInt();
            switch(Case){
                case 1: 
                    mylist.add(NewStudent.newStudent());
                    break;
                case 2:
                    int IDedit;
                    System.out.println("Ma ID muon EDIT: ");
                    IDedit=sc.nextInt();
                    Edit_and_remove.editbyID(IDedit, mylist);
                    break;
                case 3:
                    int IDremove;
                    System.out.println("Ma ID muon REMOVE: ");
                    IDremove=sc.nextInt();
                    Edit_and_remove.removebyID(IDremove, mylist);
                    break;
                case 4:
                    Sort_list.Sorted(mylist);
                    break;
                case 5: 
                    break;
                case 6:
                    Iterator<Student> itr=mylist.iterator();
                    int i=1;
                    while (itr.hasNext()){
                        System.out.println("Sinh vien thu "+i);
                        ++i;
                        itr.next().showSD();
                    }
                    break;
                case 0:
                    System.exit(0);
                default: break;
            }
            
        }
    }
}