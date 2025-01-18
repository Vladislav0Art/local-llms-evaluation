package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        Property<?> property = null;
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        propertyListBuilder.add(property);
    }

    @Test
    public void addValidPropertyTest() {
        Property<?> property = Mockito.mock(Property.class);
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        propertyListBuilder.add(property);
    }

    @Test
    public void createTest() {
        Property<?> property = Mockito.mock(Property.class);
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        propertyListBuilder.add(property);
        List<Property<?>> properties = propertyListBuilder.create();

        assertNotNull(properties);
        assertTrue(properties.contains(property));
    }

    @Test
    public void createWithoutAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> properties = propertyListBuilder.create();

        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
        assertTrue(rootEntries.isEmpty());
    }

}