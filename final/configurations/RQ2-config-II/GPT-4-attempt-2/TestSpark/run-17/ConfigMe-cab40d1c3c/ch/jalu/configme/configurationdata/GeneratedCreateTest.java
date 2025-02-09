package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        // Given
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.property");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);

        // When
        List<Property<?>> properties = propertyListBuilder.create();

        // Then
        assertEquals(1, properties.size());
        assertTrue(properties.contains(property));
    }

}