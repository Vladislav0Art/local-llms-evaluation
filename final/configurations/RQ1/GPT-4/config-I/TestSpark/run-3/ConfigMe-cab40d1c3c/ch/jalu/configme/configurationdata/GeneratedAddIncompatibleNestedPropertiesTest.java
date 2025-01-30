package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddIncompatibleNestedPropertiesTest {

    @Test
    public void addIncompatibleNestedPropertiesTest() {
        Property<String> propertyGroup = new Property<>("property", "default");
        Property<String> propertyNested = new Property<>("property.nested", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyGroup);

        try {
            builder.add(propertyNested);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Unexpected entry found at path 'property'", e.getMessage());
        }
    }

}