package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestGetIgnoreCaseReturnsNullForNonExistentKey {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testGetIgnoreCaseReturnsNullForNonExistentKey() {
        Attributes attributes = new Attributes();
        String key = "KEY";
        String result = attributes.getIgnoreCase(key);
        assertNull(result);
    }

}