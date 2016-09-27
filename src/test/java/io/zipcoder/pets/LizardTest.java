package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by carinablair on 9/26/16.
 */
public class LizardTest {
    Lizard lizard;

    @Before
    public void initialize(){lizard = new Lizard("Lizzy");}
    @Test
    public void getPetName(){
        lizard.setPetName("Jawn");
        Assert.assertEquals("This should return Jawn", "Jawn", lizard.getPetName());
    }

    @Test
    public void getSpeak(){
        Assert.assertEquals("This should return woof woof", "slizz slizz", lizard.getSpeak());
    }
}
