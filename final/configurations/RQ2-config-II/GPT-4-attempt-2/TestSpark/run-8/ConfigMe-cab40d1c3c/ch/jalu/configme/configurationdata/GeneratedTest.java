package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

    @Test
    public void addPropertyTest() {
        // Arrange
        Property mockProperty = mock(Property.class);
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Act
        propertyListBuilder.add(mockProperty);
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        assertEquals(1, result.size());
        assertEquals(mockProperty, result.get(0));
    }

    @Test
    public void createEmptyListTest() {
        // Act
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        assertTrue(result.isEmpty());
    }

    @Test
    public void getRootEntriesReturnEmptyMapTest() {
        // Act
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // Assert
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}