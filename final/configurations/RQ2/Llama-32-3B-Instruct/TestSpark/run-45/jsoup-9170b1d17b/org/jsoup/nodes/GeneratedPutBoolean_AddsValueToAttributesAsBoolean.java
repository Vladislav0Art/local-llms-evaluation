package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedPutBoolean_AddsValueToAttributesAsBoolean {

    @Test
    public void putBoolean_AddsValueToAttributesAsBoolean() {
        Attributes attributes = new Attributes();
        attributes.put("true", Boolean.TRUE);
        assertTrue(attributes.get("true").equals(Boolean.TRUE));
    }

}