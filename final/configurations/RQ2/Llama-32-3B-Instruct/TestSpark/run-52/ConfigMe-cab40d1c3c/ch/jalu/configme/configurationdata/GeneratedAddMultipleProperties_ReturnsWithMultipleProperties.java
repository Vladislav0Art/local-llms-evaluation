package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.properties.Property;

public class GeneratedAddMultipleProperties_ReturnsWithMultipleProperties {

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

}