package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedPut_AddsValueToAttributes {

    @Test
    public void put_AddsValueToAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.get("test"));
    }

}