package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestAddSetKeyAndValue {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testAddSetKeyAndValue() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.add(key, value);
        assertEquals(value, attributes.get(key));
    }

}