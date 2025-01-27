package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestPutSetKeyAndValue {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testPutSetKeyAndValue() {
        Attributes attributes = new Attributes();
        String key = "key";
        boolean value = true;
        attributes.put(key, value);
        assertTrue(attributes.hasKey(key));
    }

}