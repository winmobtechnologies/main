package org.test.package2;

import org.test.package1.Person;

public class Test  extends Person {

    public void book() {
        fort(); 
        // since protected method is visible through inheritance
}
    public static void main(String[] args) {
        Test epc = new Test();
        epc.fort(); 
       // Since it is accessed through a reference
    }
}