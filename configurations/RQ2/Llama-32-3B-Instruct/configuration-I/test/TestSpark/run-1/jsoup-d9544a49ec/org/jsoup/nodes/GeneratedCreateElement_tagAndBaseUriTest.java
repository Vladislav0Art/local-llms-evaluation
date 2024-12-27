package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateElement_tagAndBaseUriTest {

    @Test
    public void createElement_tagAndBaseUriTest() {
        Element element = new Element(Tag.TAG, null);
        assertEquals(null, element.baseUri());
    }

}