package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addProperty_PropertyAdded_PropertyPresent() {
        // Arrange
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("test.path");

        // Act
        propertyListBuilder.add(property);

        // Assert
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("test"));
        assertTrue(rootEntries.get("test") instanceof Map);
        Map<String, Object> childMap = (Map<String, Object>) rootEntries.get("test");
        assertEquals(1, childMap.size());
        assertTrue(childMap.containsKey("path"));
        assertEquals(property, childMap.get("path"));
    }

    @Test
    public void addProperty_DuplicatePath_ExceptionThrown() {
        // Arrange
        propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("test.path");

        // Act
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}