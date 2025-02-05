package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        try {
            propertyListBuilder.add(null);
            assertTrue(false); // Test should not reach this point
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("default value");

        propertyListBuilder.add(mockProperty);
        List<Property<?>> list = propertyListBuilder.create();

        assertEquals(1, list.size());
        assertEquals(mockProperty, list.get(0));
    }

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> list = propertyListBuilder.create();

        assertEquals(0, list.size());
    }

    @Test
    public void getRootEntriesOnNewInstanceTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertEquals(0, rootEntries.size());
    }

    @Test
    public void getRootEntriesAfterAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("default value");

        propertyListBuilder.add(mockProperty);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertEquals(1, rootEntries.size());
        assertEquals("default value", rootEntries.get("test.path"));
    }

}