package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by carinablair on 9/26/16.
 */
public class PetsTest {
    Pets pet;

    @Before
    public void initialize(){pet = new Pets("Sparky");}
     @Test
    public void getPetName(){
         pet.setPetName("Paul");
         Assert.assertEquals("This should return Paul", "Paul", pet.getPetName());
     }

     @Test
    public void getSpeak(){
         Assert.assertEquals("This should return Hello", "Hello", pet.getSpeak());
     }
}
