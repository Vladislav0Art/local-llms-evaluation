package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedAddPropertyWithSameNameTest {

    @Test
    public void addPropertyWithSameNameTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Property<?> property1 = new SimpleTestProperty("property1", "default1");

        builder.add(property1);

        try {
            Property<?> property1Duplicate = new SimpleTestProperty("property1", "default1Duplicate");
            builder.add(property1Duplicate);
            fail("Should have thrown an exception when adding duplicate property.");
        } catch (ConfigMeException e) {
            assertEquals("Path at 'property1' already exists", e.getMessage());
        }
    }

}