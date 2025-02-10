package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.properties.Property;

public class GeneratedTest {

    public static class Property {
        private String name;
        private String value;

        public Property(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }
    }

    @Test
    public void addPropertyWithoutProperties_ReturnsEmptyList() {
        List<Property> result = new PropertyListBuilder().create();
        assertEquals(0, result.size());
    }

    @Test
    public void addOneProperty_ReturnsWithSingleProperty() {
        List<Property> expected = new ArrayList<>();
        Property property = new Property("test", "value");
        expected.add(property);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.addProperty(property);
        List<Property> result = builder.create();
        assertEquals(1, result.size());
        assertEquals("test", result.get(0).getName());
    }

    @Test
    public void addMultipleProperties_ReturnsWithMultipleProperties() {
        List<Property> expected = new ArrayList<>();
        Property property1 = new Property("test1", "value1");
        Property property2 = new Property("test2", "value2");
        expected.add(property1);
        expected.add(property2);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.addProperty(property1);
        builder.addProperty(property2);
        List<Property> result = builder.create();
        assertEquals(2, result.size());
    }

    @Test
    public void createEmptyListWhenNoPropertiesAdded() {
        List<Property> result = new PropertyListBuilder().create();
        assertTrue(result.isEmpty());
    }

}