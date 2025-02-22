package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        // Create a property to add
        Property<String> property = new Property<>("test", String.class, "default");

        // Add the property
        builder.add(property);

        // Verify that the property was added
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}