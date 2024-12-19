package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.*;

public class GeneratedTest {

    @Test
    public void testTagHasChildren() {
        Document doc = Jsoup.create("<div>Hello World!</div>");
        assertElementHasChildNodes(doc).size() == 1;
    }

    @Test
    public void testTagHasAttributes() {
        Document doc = Jsoup.create("<span id='my-span'>Hello World!</span>");
        assertElementHasAttributes(doc);
    }

    @Test
    public void testTagHasBaseUri() {
        Document doc = Jsoup.create("<div>https://example.com/</div>");
        assertNodeHasAttribute(doc, "baseuri", "https://example.com/");
    }

    @Test
    public void testTagHasData() {
        Document doc = Jsoup.create("<span>Hello World!</span>");
        assertEquals("", doc.getData());
        doc.appendText("World!");
        assertEquals("Hello World!", doc.getData());
    }

}