
abstract class Personn
{
    String name;
    int age;
    
    Personn(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    void show()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class ConcretePerson extends Personn {
    ConcretePerson(String name, int age) {
        super(name, age);
    }
}

public class Person12 {
    public static void main(String[] args) {
        // Create an instance of ConcretePerson
        Personn x = new ConcretePerson("Ob", 24);
        x.show();
    }
}
