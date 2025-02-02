package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAsStringReturnsEmptyForNullElements {

    @Test
    public void asStringReturnsEmptyForNullElements() {
        Element element = null;
        assertEquals("", element.toString());
    }

}