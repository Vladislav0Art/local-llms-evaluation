package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestCheckNotNullReturnsNullForNullValue {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testCheckNotNullReturnsNullForNullValue() {
        String value = null;
        String result = Attributes.checkNotNull(value);
        assertEquals(null, result);
    }

}