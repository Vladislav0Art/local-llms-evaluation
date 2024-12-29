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

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        propertyListBuilder.add(mockProperty);

        // When
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        // Then
        // Verify that the root entries Map is obtained
        assertNotNull(rootEntries);
    }

}