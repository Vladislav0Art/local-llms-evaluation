package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedGet_EmptyAttributes_ReturnsEmpty {

    @Test
    public void get_EmptyAttributes_ReturnsEmpty() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get(""));
    }

}