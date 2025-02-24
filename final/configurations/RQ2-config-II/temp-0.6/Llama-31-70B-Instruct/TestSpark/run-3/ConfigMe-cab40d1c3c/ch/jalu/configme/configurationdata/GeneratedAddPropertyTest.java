package ch.jalu.configme.configurationdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ch.jalu.configme.properties.Property;
import org.junit.jupiter.api.Test;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Property.builder("testKey").defaultValue(1).build();
        propertyListBuilder.add(property);
        assertEquals(property, propertyListBuilder.getRootEntries().get("testKey"));
    }

}