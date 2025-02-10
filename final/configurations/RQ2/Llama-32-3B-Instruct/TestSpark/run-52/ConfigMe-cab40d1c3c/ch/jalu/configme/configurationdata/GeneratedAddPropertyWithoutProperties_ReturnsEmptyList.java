package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.properties.Property;

public class GeneratedAddPropertyWithoutProperties_ReturnsEmptyList {

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

}