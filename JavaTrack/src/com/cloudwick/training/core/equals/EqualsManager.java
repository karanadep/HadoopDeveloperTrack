package com.cloudwick.training.core.equals;

import com.sun.jndi.cosnaming.IiopUrl;

/**
 * Created by cloudwickguest on 8/2/16.
 */
public class EqualsManager {
    public static void main(String[] args) {
        Address addobj = new Address();
        Address addobj2 = new Address();
        System.out.println("addobj: " + addobj);
        System.out.println("addobj2: " + addobj2);
        System.out.println( addobj == addobj2);

        addobj.name = "F";
        addobj.zip = 123123;
        addobj2.name = "F";
        addobj2.zip = 123123;
        System.out.println(addobj.equals(addobj2));

    }
}
