package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestIsEmptyReturnTrueWhenEmpty {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testIsEmptyReturnTrueWhenEmpty() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

}