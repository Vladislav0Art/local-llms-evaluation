package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        // Given
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.property");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(property);

        // Then
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue("Root entries should contain added property", rootEntries.containsKey("test.property"));
    }

}