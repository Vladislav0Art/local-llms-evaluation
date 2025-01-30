package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        Property<String> propertyOne = new StringProperty("property.one", "default");
        Property<String> propertyTwo = new StringProperty("property.two", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyTwo);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.get("property") instanceof Map);
    }

    @Test
    public void addSamePropertyTwiceTest() {
        Property<String> property = new StringProperty("property", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Path at 'property' already exists", e.getMessage());
        }
    }

    @Test
    public void createNestedPropertyListTest() {
        Property<String> propertyOne = new StringProperty("property.one", "default");
        Property<String> propertyTwo = new StringProperty("property.two", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyTwo);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals("property.one", properties.get(0).getPath());
        assertEquals("property.two", properties.get(1).getPath());
    }

    @Test
    public void addInconsistentNestedPropertiesTest() {
        Property<String> propertyGroup = new StringProperty("property", "default");
        Property<String> propertyNested = new StringProperty("property.nested", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyGroup);

        try {
            builder.add(propertyNested);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Unexpected entry found at path 'property'", e.getMessage());
        }
    }

    @Test
    public void addPropertyToDifferentNestedGroupsTest() {
        Property<String> propertyOne = new StringProperty("property.one", "default");
        Property<String> propertyNested = new StringProperty("propertyNested.value", "default");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(propertyOne);
        builder.add(propertyNested);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals("property.one", properties.get(0).getPath());
        assertEquals("propertyNested.value", properties.get(1).getPath());
    }

}