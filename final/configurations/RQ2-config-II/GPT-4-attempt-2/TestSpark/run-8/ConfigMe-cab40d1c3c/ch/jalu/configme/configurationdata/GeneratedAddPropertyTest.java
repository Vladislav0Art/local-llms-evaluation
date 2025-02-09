package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedAddPropertyTest {

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

}