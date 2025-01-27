package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestDeduplicateReturnCountOfAttributesInList {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testDeduplicateReturnCountOfAttributesInList() {
        ParseSettings settings = new ParseSettings();
        Attributes attributes = new Attributes();
        List<Attribute> list = Arrays.asList(
                new Attribute("attribute1", "value1"),
                new Attribute("attribute2", "value2")
        );
        int deduplicatedValue = attributes.deduplicate(settings);
        assertEquals(2, deduplicatedValue);
    }

}