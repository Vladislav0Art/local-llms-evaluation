package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addPropertyToExistingPathTest() {
        Property<String> property1 = new StringProperty("path.that.exists", "test1");
        Property<String> property2 = new StringProperty("path.that.exists", "test2");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);

        try {
            propertyListBuilder.add(property2);
            fail("Adding duplicate property did not throw exception as expected");
        } catch (ConfigMeException e) {
            assertEquals("Path at 'path.that.exists' already exists", e.getMessage());
        }
    }

    @Test
    public void addPropertyToNewPathTest() {
        Property<String> property = new StringProperty("path.that.is.new", "test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        assertTrue(propertyListBuilder.getRootEntries().get("path") instanceof java.util.Map);
    }

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.isEmpty());
    }

    @Test
    public void createNonEmptyListTest() {
        Property<String> property = new StringProperty("path.to.property", "test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesNonEmptyTest() {
        Property<String> property = new StringProperty("path.to.property", "test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        assertFalse(propertyListBuilder.getRootEntries().isEmpty());
    }

}