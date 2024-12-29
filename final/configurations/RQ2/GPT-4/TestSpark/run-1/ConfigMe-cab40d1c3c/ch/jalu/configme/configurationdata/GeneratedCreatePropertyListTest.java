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

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        propertyListBuilder.add(mockProperty);

        // When
        List<Property<?>> propertyList = propertyListBuilder.create();

        // Then
        // Verify that the property list is created and contains the added property
        assertNotNull(propertyList);
        assertEquals(1, propertyList.size());
        assertTrue(propertyList.contains(mockProperty));
    }

}