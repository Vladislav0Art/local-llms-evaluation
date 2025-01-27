package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedNullValueReturnsNewAttributesInstance {

    @Test
    public void nullValueReturnsNewAttributesInstance() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

}