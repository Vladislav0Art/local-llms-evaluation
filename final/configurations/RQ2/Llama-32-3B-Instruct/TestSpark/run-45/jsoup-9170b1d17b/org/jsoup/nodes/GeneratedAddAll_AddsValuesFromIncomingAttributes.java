package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedAddAll_AddsValuesFromIncomingAttributes {

    @Test
    public void addAll_AddsValuesFromIncomingAttributes() {
        Attributes incoming = new Attributes();
        incoming.put("test", "value");
        Attributes attributes = new Attributes();
        attributes.addAll(incoming);
        assertEquals("value", attributes.get("test"));
    }

}