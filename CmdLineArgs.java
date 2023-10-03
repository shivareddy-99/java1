import java.io.*;
public class CmdLineArgs extends Object {
\\Object is the super class of all classes in java
       public static void main (String args[]) {
               int x = Integer.parseInt(args[0]);\\Integer is a wrapper class in java
               int y = Integer.parseInt(args[1]);
               int z = x + y;
               System.out.println(" sum of "+x+" and "+y+" is "+z);
}
}