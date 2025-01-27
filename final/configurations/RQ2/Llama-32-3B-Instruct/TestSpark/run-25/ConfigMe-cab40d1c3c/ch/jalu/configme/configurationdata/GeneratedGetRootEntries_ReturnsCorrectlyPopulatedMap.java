package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetRootEntries_ReturnsCorrectlyPopulatedMap {

    @Test
    public void getRootEntries_ReturnsCorrectlyPopulatedMap() {
        // Given
        Map<String, Object> entries = new LinkedHashMap<>();
        entries.put("key", "value");

        // When
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> result = builder.getRootEntries();

        // Then
        assertEquals(entries, result);
    }

}