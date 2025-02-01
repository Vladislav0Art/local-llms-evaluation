package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new TypicalProperty();

        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.containsKey("test_property"));
    }

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new TypicalProperty();

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new TypicalProperty();
        propertyListBuilder.add(property);

        List<Property<?>> createdProperties = propertyListBuilder.create();
        assertEquals(1, createdProperties.size());
        assertEquals(property, createdProperties.get(0));
    }

    @Test
    public void createPropertyListNoPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> createdProperties = propertyListBuilder.create();
        assertTrue(createdProperties.isEmpty());
    }

    private static class TypicalProperty implements Property<String> {
        @Override
        public String getPath() {
            return "test_property";
        }

        @Override
        public String getDefaultValue() {
            return "default_value";
        }
    }

}