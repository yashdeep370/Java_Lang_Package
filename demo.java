import java.lang.*;

public class demo {
    public static void main(String[] args) {
        Myobject o1 = new Myobject();
        // System.out.println(o1);
        Myobject o2 = new Myobject();
        System.out.println(o1.equals(o2));
        // Object o1 = new Object();
        // Object o2 = o1;
        // System.out.println(o1.hashCode());
        // System.out.println(o1.equals(o2));
    }
}

class Myobject{
    public String toString(){
        return "My object";
    }

    public int hashCode()
    {
        return 100;
    }

    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}
