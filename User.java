public class User {
    private String name;
    private int age;

    //setters & gettesrs 
    public User(String name,int age){
        this.name=name;
        setAge(age);
    }
    
    public void setName (String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age<100){
            this.age=age;
        } 
        else{
            System.out.println("Error *************");
        }
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //methods
    public void printUser(){
        System.out.println("---------------------------------");
        System.out.println("User Information");
        System.out.println("Name:"+this.name);
        System.out.println("Name:"+this.age);
        System.out.println("---------------------------------");
    
    
    }



}
