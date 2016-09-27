package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by carinablair on 9/26/16.
 */
public class CatTest {
    Cat cat;

    @Before
    public void initialize(){cat = new Cat("Tiger");}
    @Test
    public void getPetName(){
        cat.setPetName("Lion");
        Assert.assertEquals("This should return Lion", "Lion", cat.getPetName());
    }

    @Test
    public void getSpeak(){
        Assert.assertEquals("This should return meow meow", "meow meow", cat.getSpeak());
    }
}
