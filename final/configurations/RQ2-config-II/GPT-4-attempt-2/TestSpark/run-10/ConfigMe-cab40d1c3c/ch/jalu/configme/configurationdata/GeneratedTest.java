package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        try {
            listBuilder.add(null);
            fail("Expected exception not thrown");
        } catch (ConfigMeException e) {
            assertEquals("Property must not be null", e.getMessage());
        }
    }

    @Test
    public void addAndCreatePropertiesTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty1 = Mockito.mock(Property.class);
        Property<Integer> mockProperty2 = Mockito.mock(Property.class);
        listBuilder.add(mockProperty1);
        listBuilder.add(mockProperty2);
        List<Property<?>> properties = listBuilder.create();
        assertEquals(2, properties.size());
        assertTrue(properties.contains(mockProperty1));
        assertTrue(properties.contains(mockProperty2));
    }

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        assertTrue(listBuilder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesAfterAddTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<Integer> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("Test");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn(12345);
        listBuilder.add(mockProperty);
        assertFalse(listBuilder.getRootEntries().isEmpty());
        assertTrue(listBuilder.getRootEntries().containsKey("Test"));
        assertEquals(12345, listBuilder.getRootEntries().get("Test"));
    }

}