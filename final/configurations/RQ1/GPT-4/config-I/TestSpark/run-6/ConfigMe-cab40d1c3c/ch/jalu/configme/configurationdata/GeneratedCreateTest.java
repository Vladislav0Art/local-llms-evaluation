package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        // Given
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> firstProperty = new StringProperty("FirstPath", "DefaultValue");
        Property<String> secondProperty = new StringProperty("SecondPath", "SecondDefaultValue");

        // When
        listBuilder.add(firstProperty);
        listBuilder.add(secondProperty);

        // Then
        List<Property<?>> properties = listBuilder.create();
        assertTrue(properties.contains(firstProperty));
        assertTrue(properties.contains(secondProperty));
        assertEquals(2, properties.size());
        assertEquals(firstProperty, properties.get(0));
        assertEquals(secondProperty, properties.get(1));
    }

}