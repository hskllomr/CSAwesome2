/** Pet class (complete comments)
 *
 * @author
 * @since
 */
class Pet
{
    // keep track of the name, age, weight, type of animal, and breed of the pet
    private String name;
    private int age;
    private int weight;
    private String type;
    private String breed;

    // Write a constructor, accessor (get) methods, and a toString method. Use good
    // commenting.
    public Pet(String name2,int age2,int weight2,String type2,String breed2)
    {
        name=name2;
        age=age2;
        weight=weight2;
        type=type2;
        breed=breed2;
    }

    public String getname()
    {
        return name;
    }

    public int getage()
    {
        return age;
    }

    public int getweight()
    {
        return weight;
    }

    public String gettype()
    {
        return type;
    }

    public String getbreed()
    {
        return breed;
    }

    public String toString()
    {
        return name +":"+ age +":"+ weight+":"+type+":"+breed;
    }

    // Don't forget to complete the main method in the TesterClass below!
}

public class TesterClass
{
    // main method for testing
    public static void main(String[] args)
    {
        // Create 2 Pet objects and test all your methods
        Pet pet = new Pet("Daisy",10,30,"dog","french spaniel");
        Pet pet2 = new Pet("Riley",20,40,"cat","Turkish Van");
        System.out.println(pet.getname());
        System.out.println(pet.getage());
        System.out.println(pet.getweight());
        System.out.println(pet.gettype());
        System.out.println(pet.getbreed());
        System.out.println(pet2.getname());
        System.out.println(pet2.getage());
        System.out.println(pet2.getweight());
        System.out.println(pet2.gettype());
        System.out.println(pet2.getbreed());

    }
}

/***********************************************************************************************************************
 /**
 * Pet class (complete comments)
 *
 * @author
 * @since
 */
class Pet
{
    private String name;
    private int age;
    private int weight;
    private String type;
    private String breed;

    public Pet(String name2,int age2,int weight2,String type2,String breed2)
    {
        name=name2;
        age=age2;
        weight=weight2;
        type=type2;
        breed=breed2;
    }

    public void setname(String setName)
    {
        name=setName;
    }

    public void setage(int setage)
    {
        age=setage;
    }

    public void settype(String settype)
    {
        type=settype;
    }

    public void setweight(int setweight)
    {
        weight=setweight;
    }

    public void setBreed(String setbreed)
    {
        breed=setbreed;
    }

    public String toString()
    {
        return name+":"+age+":"+type+":"+breed;
    }

    public String getname()
    {
        return name;
    }

    public int getage()
    {
        return age;
    }

    public String gettype()
    {
        return type;
    }

    public String getbreed()
    {
        return breed;
    }

    public int getweight()
    {
        return weight;
    }


    // complete class definition with set methods

}

public class TesterClass
{
    // main method for testing
    public static void main(String[] args)
    {
        // Create 2 Pet objects and test all your set methods
        Pet pet = new Pet("Daisy",10,20,"dog","french spaniel");
        Pet pet2 = new Pet("Riley",20,10,"cat","Turkish Van");
        Pet pet3 = new Pet("Angel",3,2,"bird","Dove");
        System.out.println(pet);
        System.out.println(pet2);
        System.out.println(pet3);

    }
}
