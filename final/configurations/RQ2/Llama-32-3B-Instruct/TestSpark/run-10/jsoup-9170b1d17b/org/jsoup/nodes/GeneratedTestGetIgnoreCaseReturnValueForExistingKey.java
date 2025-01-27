package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestGetIgnoreCaseReturnValueForExistingKey {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testGetIgnoreCaseReturnValueForExistingKey() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "Value");
        assertEquals("Value", attributes.getIgnoreCase("key"));
    }

}