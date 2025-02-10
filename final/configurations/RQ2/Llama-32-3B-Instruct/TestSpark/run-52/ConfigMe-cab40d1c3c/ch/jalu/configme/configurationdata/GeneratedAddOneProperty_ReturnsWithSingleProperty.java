package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.properties.Property;

public class GeneratedAddOneProperty_ReturnsWithSingleProperty {

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

}