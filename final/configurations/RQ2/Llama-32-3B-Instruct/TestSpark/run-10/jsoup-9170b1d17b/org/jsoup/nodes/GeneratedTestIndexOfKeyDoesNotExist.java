package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestIndexOfKeyDoesNotExist {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testIndexOfKeyDoesNotExist() {
        Attributes attributes = new Attributes();
        int index = attributes.indexOfKey("non-existent-key");
        assertEquals(-1, index);
    }

}