package jia.begins.examples.basics.ogniana.rainova;

import jia.begins.examples.basics.ogniana.rainova.common.Employee;
import jia.begins.examples.basics.ogniana.rainova.common.IEmployee;

import java.io.*;
import java.math.BigDecimal;

import static java.lang.System.*;

/**
 * User: jr-fire
 * Date: Nov 6, 2010
 * Time: 12:43:40 AM
 */
public class Exercise1 {
    private static final String DB_FILE = "/home/jr-fire/jacme-inc.txt";

    public static void main(String[] args){
     File db = new File(DB_FILE);
     FileOutputStream fs;

     try {
         fs = new FileOutputStream(db, true);

         DataOutputStream dos = new DataOutputStream(fs);

         IEmployee employee1 = new Employee("Carol", "Lindsey", 43, "ofice-assistant", new BigDecimal(1760));
         IEmployee employee2 = new Employee("Gorden", "Brown", 56, "cleaner", new BigDecimal(1230));
         IEmployee employee3 = new Employee("Brian", "Lindsey", 47, "CSO", new BigDecimal(5760));

         try {
            dos.writeChars(employee1.toString());
            dos.writeChars("\n");

            dos.writeChars(employee2.toString());
            dos.writeChars("\n");

            dos.writeChars(employee3.toString());
            dos.writeChars("\n");

            dos.close();
         }
         catch(IOException e) {
                out.printf("Cannot write to file (%s). %s", DB_FILE, e.toString());
        }

        fs.close();
     }
     catch(FileNotFoundException e) {
         out.printf("File not found (%s). %s", DB_FILE, e.toString());
//         e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     }
     catch(IOException e) {
         out.printf("Couldn't close file (%s). %s", DB_FILE, e.toString());
//         e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
     }
 }
}
