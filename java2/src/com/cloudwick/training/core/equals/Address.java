package com.cloudwick.training.core.equals;

import java.util.Objects;

/**
 * Created by cloudwickguest on 8/2/16.
 */
public class Address {
    public String name;
    public int zip;
    @Override
    public boolean equals (Object o){
        if(o == null){
            return false;
        }
        if(! (o instanceof Address)){
            return false;
        }
        Address add = (Address) o;
        return this.name.equals(add.name) && this.zip == add.zip;
    }
    @Override
    public int hashCode(){
        int hash = 77;
        hash += this.zip;
        hash += (this.name == null?0:this.name.hashCode());
        return hash;
    }
}
