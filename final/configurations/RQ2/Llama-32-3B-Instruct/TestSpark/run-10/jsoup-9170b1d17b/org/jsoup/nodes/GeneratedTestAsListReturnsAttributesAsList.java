package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestAsListReturnsAttributesAsList {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testAsListReturnsAttributesAsList() {
        Attributes attributes = new Attributes();
        Attribute attribute1 = new Attribute("attribute1", "value1");
        Attribute attribute2 = new Attribute("attribute2", "value2");
        List<Attribute> list = attributes.asList();
        assertEquals(2, list.size());
    }

}