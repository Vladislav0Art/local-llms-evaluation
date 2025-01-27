package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIteratorReturnsOneElement {

    @Test
    public void iteratorReturnsOneElement() {
        Attribute attribute = new Attribute("attribute");
        when(attribute.toString()).thenReturn("attribute");
        Attributes attributes = new Attributes();
        Iterator<Attribute> iterator = attributes.iterator();
        assertEquals(1, java.util.Collections.frequency(Arrays.asList(iterator.next()), attribute));
    }

}