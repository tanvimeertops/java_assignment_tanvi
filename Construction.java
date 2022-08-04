/*object oriented concept
 * class
 * object
 * polymorphism
 * encapsulation
 * abstraction
 * inheritance
 * interface
 * 1.object gives the permission to access the functionalities out side the class.
 * 2.class has its attributes and functions which works on the attributes. 
 * tcs is a class and we all know that tcs has the head office in mumbai so the class is set up we just need to use 
 * its functions with the help of objects
 * 3.constructor is a special member function whose task is to initialize the object if its class 
 * characteristis:
 * 1. its name is same as a class name.
 * 2. it has no return type.
 * 3. it invokes automatically when the object is created.
 * types of constructor
 * 1.default(no argu)
 * 2.parameterised (argu)
 * 3.copy(obj as argu)
 */
/**
 * InnerConstruction
 */
class InnerConstruction {
    private int length, width, depth;

    InnerConstruction() {
        length = 1;
        width = 2;
        depth = 3;
        System.out.println("default constructor called");
    }

    InnerConstruction(int l, int w, int d) {
        length = l;
        width = w;
        depth = d;
        System.out.println("parameterized constructor called");
    }
    InnerConstruction(InnerConstruction Ic) {
       length=Ic.length;
       width=Ic.width;
       depth=Ic.depth;
        System.out.println("copy constructor called");
    }

    void volume() {

        System.out.println("volume:" + length * width * depth);
    }
}

public class Construction {
    public static void main(String[] args) {
        InnerConstruction dc = new InnerConstruction();
        dc.volume();
        InnerConstruction pc = new InnerConstruction(4, 5, 6);
        pc.volume();
        InnerConstruction cc=new InnerConstruction(pc);
        cc.volume();

    }
}
