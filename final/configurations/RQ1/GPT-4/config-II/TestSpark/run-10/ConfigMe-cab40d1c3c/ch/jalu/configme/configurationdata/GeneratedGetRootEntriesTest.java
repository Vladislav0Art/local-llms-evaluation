package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        Map<String, Object> result = propertyListBuilder.getRootEntries();

        // Then
        assertTrue(result.isEmpty());
    }

}