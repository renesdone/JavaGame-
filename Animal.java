public class Animal {
    public String name;
    public String type;
    public Animal (String name,String type){
        this.name=name;
        this.type=type;
    }
    public void printAnimal(){
        System.out.println("***********************");
        System.out.println("Animal Information");
        System.out.println("Name:" + name);
        System.out.println("Type:"+type);
        System.out.println("***********************");
    }

    public void attack(Student s){
        System.out.println(this.name + " " + "attacks " + s.getName() );

    }



}