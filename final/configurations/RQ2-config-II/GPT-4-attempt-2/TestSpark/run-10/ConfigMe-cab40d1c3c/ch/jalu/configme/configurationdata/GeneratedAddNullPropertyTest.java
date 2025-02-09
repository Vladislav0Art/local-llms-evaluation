package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        try {
            listBuilder.add(null);
            fail("Expected exception not thrown");
        } catch (ConfigMeException e) {
            assertEquals("Property must not be null", e.getMessage());
        }
    }

}