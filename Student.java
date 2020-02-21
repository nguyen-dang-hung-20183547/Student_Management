public class Student{
    private int ID;
    private String name;
    private int age;
    private String address;
    private double GPA;
    
    public int getID(){
        return this.ID;
    }
    public int getage(){
        return this.age;
    }
    public String getaddress(){
        return this.address;
    }
    public double getGPA(){
        return this.GPA;
    }
    public String getname(){
        return this.name;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setGPA(double GPA){
        this.GPA=GPA;
    }
    public void showSD(){
        System.out.println("1.Name: "+getname());
        System.out.println("    2.ID: "+getID());
        System.out.println("        3.Age: "+getage());
        System.out.println("            4.Address: "+getaddress());
        System.out.println("                5.GPA: "+getGPA());
    }
}