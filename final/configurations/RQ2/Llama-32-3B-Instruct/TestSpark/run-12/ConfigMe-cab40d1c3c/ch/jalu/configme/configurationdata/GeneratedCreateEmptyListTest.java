package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateEmptyListTest {

    @Test
    public void createEmptyListTest() {
        // Arrange & Act
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property> result = ((PropertyListBuilder) builder).create();

        // Assert
        assertTrue(result.isEmpty());
    }

}

class Property {
}

class PropertyListBuilder {
    private List<Object> properties = new ArrayList<>();

    public void add(Object object) {
        properties.add(object);
    }

    public List<Object> create() {
        return properties;
    }

}