package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestDatasetReturnsEmptyMapWhenNoData {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testDatasetReturnsEmptyMapWhenNoData() {
        Attributes attributes = new Attributes();
        Map<String, String> map = attributes.dataset();
        assertTrue(map.isEmpty());
    }

}