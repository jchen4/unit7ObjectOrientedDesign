import java.util.*;

public class Person implements Comparable
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Object obj)
    {
        Person personObj = (Person)obj;
        
        return personObj.getName().compareTo(this.name);
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        Scanner s = new Scanner(System.in);
        
        for( int i = 0; i < 10; i++)
        {
            System.out.println("Enter a person's name: ");
            String name = s.next();
            list.add(new Person(name));
        }
        
        Person sentinel = list.get(0);
        Person sentinel2 = list.get(0);
        for(Person p : list)
        {
            if (p.compareTo(sentinel) < 0)
            {
                sentinel = p;
            }
            
            if (p.compareTo(sentinel2) > 0)
            {
                sentinel2 = p;
            }
        }
        
        System.out.println("First: " + sentinel2.getName());
        System.out.println("Last: " + sentinel.getName());
    }
}
