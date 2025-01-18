package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateEmptyTest {

    @Test
    public void createEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Assert.assertTrue(propertyListBuilder.create().isEmpty());
    }

}