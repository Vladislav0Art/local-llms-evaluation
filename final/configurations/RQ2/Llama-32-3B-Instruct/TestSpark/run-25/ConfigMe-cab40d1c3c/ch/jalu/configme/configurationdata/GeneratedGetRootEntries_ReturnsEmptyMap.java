package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetRootEntries_ReturnsEmptyMap {

    @Test
    public void getRootEntries_ReturnsEmptyMap() {
        // Given

        // When
        Map<String, Object> result = new PropertyListBuilder().getRootEntries();

        // Then
        assertTrue(result.isEmpty());
    }

}