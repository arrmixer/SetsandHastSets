package com.AE;

/**
 * Created by Angel on 2/2/17.
 */
public class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }
//    put final on original to prevent the equals method from being overwritten

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//
//        if(obj instanceof Labrador){
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//
//        return false;
//    }
}
