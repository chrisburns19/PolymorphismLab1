package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by carinablair on 9/26/16.
 */
public class DogTest {

    Dog dog;

    @Before
    public void initialize(){dog = new Dog("Wolfy");}
    @Test
    public void getPetName(){
        dog.setPetName("Wolverine");
        Assert.assertEquals("This should return Wolverine", "Wolverine", dog.getPetName());
    }

    @Test
    public void getSpeak(){
        Assert.assertEquals("This should return woof woof", "woof woof", dog.getSpeak());
    }
}
