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

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        List<Property<?>> propertyList = propertyListBuilder.create();

        // Then
        // Verify that the property list is created and that it's empty
        assertNotNull(propertyList);
        assertTrue(propertyList.isEmpty());
    }

}