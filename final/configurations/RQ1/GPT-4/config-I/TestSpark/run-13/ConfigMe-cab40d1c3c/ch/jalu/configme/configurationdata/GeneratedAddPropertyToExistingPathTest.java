package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddPropertyToExistingPathTest {

    @Test
    public void addPropertyToExistingPathTest() {
        Property<String> property1 = new StringProperty("path.that.exists", "test1");
        Property<String> property2 = new StringProperty("path.that.exists", "test2");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);

        try {
            propertyListBuilder.add(property2);
            fail("Adding duplicate property did not throw exception as expected");
        } catch (ConfigMeException e) {
            assertEquals("Path at 'path.that.exists' already exists", e.getMessage());
        }
    }

}