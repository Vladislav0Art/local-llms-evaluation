package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedBodyReturnsNullForNullElements {

    @Test
    public void bodyReturnsNullForNullElements() {
        Element element = null;
        assertNull(element.body());
    }

}