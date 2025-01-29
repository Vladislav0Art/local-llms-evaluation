package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetIgnoreCase {

    public static Document generateAttributes() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");
        doc.appendChild(element);
        return doc;
    }

    @Test
    public void testGetIgnoreCase() {
        Document document = generateAttributes();
        Attributes attributes = document.getElementById("attributes").getElementsByName("KEY").first();

        assertEquals("test", attributes.getValue().toLowerCase());
    }

}