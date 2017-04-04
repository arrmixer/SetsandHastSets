package com.AE;

/**
 * Created by Angel on 2/2/17.
 */
public class Planet extends HeavenlyBody{


    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PlANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else{
            return false;
        }
    }
}
