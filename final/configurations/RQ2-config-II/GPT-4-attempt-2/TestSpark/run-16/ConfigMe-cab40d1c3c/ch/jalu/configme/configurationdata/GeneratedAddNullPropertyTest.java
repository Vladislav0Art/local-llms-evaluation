package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

import java.util.List;
import java.util.Map;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        try {
            propertyListBuilder.add(null);
            Assert.fail("Expected ConfigMeException was not thrown");
        } catch (ConfigMeException ex) {
            Assert.assertTrue(true); // Expected exception caught
        }
    }

}