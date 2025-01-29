package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsEmpty {

    public static Document generateAttributes() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");
        doc.appendChild(element);
        return doc;
    }

    @Test
    public void testIsEmpty() {
        Document document = generateAttributes();
        assertTrue(document.getElementById("attributes").isEmpty());
        document.getElementById("attributes").appendChild(doc.createElement("p").nodeValue("value"));

        assertFalse(document.getElementById("attributes").isEmpty());
    }

}