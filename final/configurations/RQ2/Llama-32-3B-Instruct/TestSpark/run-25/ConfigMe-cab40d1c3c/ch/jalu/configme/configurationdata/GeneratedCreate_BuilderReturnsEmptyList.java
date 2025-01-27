package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreate_BuilderReturnsEmptyList {

    @Test
    public void create_BuilderReturnsEmptyList() {
        // Given
        List<Property<?>> properties = new ArrayList<>();

        // When
        List<Property<?>> result = new PropertyListBuilder().create();

        // Then
        assertTrue(result.isEmpty());
    }

}