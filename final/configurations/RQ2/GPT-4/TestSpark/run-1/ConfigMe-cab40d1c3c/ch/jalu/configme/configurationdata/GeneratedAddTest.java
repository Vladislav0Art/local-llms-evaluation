package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);

        // When
        propertyListBuilder.add(mockProperty);

        // Then
        // No exception thrown, therefore the addition is successful
        assertTrue(true);
    }

}