package Week11;
class X{

}
class Y extends X{

}
class Z extends Y{

}
public class Instance{
    public static void main(String[]args){
        X a = new X();
        Y b = new Y();
        Object c = new Z();
       
        System.out.println(a instanceof X);
        System.out.println(b instanceof Y);
        System.out.println(b instanceof X);
        System.out.println(a instanceof Y);
        System.out.println(c instanceof Z);
        System.out.println(c instanceof X);
        System.out.println(c instanceof Y);
        
    }
}