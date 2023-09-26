public class TypeCastDemo2{
       public static void main(String[] args)
       {
       double d = 166.66;    
       long l = (long)d;       
       int i = (int)l;
       System.out.println("Before conversion: "+d);
       System.out.println("after conversion into long type: "+l);
       System.out.println("after conversion into int type: "+i);
       }
       
}   
