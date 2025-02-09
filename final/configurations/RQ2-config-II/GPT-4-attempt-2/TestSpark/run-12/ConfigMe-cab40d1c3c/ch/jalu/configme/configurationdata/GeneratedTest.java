package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addNullPropertyThrowsExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            propertyListBuilder.add(null);
            fail("Exception should be thrown when adding null Property");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage(), e.getMessage().contains("Parameter specified as non-null is null"));
        }
    }

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);
        try {
            propertyListBuilder.add(mockProperty);
        } catch (ConfigMeException e) {
            fail("Exception should not be thrown when adding valid Property");
        }
    }

    @Test
    public void createWithoutAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> properties = propertyListBuilder.create();
        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void createWithAddedPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);
        propertyListBuilder.add(mockProperty);
        List<Property<?>> properties = propertyListBuilder.create();

        assertNotNull(properties);
        assertFalse(properties.isEmpty());
        assertEquals(1, properties.size());
        assertEquals(mockProperty, properties.get(0));
    }

    @Test
    public void getRootEntriesInitialTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertNotNull(propertyListBuilder.getRootEntries());
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}