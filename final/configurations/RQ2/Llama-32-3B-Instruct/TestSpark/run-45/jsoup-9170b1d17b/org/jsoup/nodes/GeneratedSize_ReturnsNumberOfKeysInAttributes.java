package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedSize_ReturnsNumberOfKeysInAttributes {

    @Test
    public void size_ReturnsNumberOfKeysInAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals(1, attributes.size());
    }

}