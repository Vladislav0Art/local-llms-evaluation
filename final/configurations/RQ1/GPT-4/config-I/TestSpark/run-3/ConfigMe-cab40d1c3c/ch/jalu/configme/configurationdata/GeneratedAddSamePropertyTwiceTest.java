package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddSamePropertyTwiceTest {

    @Test
    public void addSamePropertyTwiceTest() {
        Property<String> property = new StringProperty("property", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Path at 'property' already exists", e.getMessage());
        }
    }

}