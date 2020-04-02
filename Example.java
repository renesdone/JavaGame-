public class Example {
 
    public static void main(String[] args){
        //Users
        User u1 = new User("Obrien",32);
        u1.printUser();
    
        User u2 = new User("Rene",34);
        u2.printUser();
    
        //Animals
        Animal a1 = new Animal("Shark","Baby");
        a1.printAnimal();
        
        Animal a2 = new Animal("Dog","Crazy");
        a2.printAnimal();
        
        //Student

        Student s1= new Student("DomQ",27,8);
        s1.printStudent();

        Student s2= new Student("Mark",55,8);
        s2.printStudent();
    

        a1.attack(s1);
        a2.attack(s2);
    
    
    
    } 
    
    
} 

