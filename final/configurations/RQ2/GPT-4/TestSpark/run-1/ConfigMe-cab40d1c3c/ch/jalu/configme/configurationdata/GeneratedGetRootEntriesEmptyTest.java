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

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        // Then
        // Verify that the root entries Map is empty when no properties are added
        assertNotNull(rootEntries);
        assertTrue(rootEntries.isEmpty());
    }

}