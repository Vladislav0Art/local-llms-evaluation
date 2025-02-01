package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreatePropertiesListTest {

    @Test
    public void createPropertiesListTest() {
        Property<String> property1 = new Property<>("first.path", "F");
        Property<Integer> property2 = new Property<>("second.path", 99);

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        List<Property<?>> properties = propertyListBuilder.create();
        assertNotNull(properties);
        assertEquals(2, properties.size());
        assertTrue(properties.contains(property1));
        assertTrue(properties.contains(property2));
    }

}