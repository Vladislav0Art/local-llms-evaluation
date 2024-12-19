package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestRemoveClass {

    private Document doc;

    @Before
    public void setUp() {
        String html = "<p>Hello World!</p>";
        doc = new Document();
        doc.appendChild(doc.createNode("html"));
        doc.appendChild(doc.createNode("head"));
        doc.appendChild(doc.createNode("body"));
        doc.appendChild(doc.createNode("script", "console.log('Hello World!');"));
        Element pElement = doc.createElement("p");
        pElement.setTextHtml(html);
        doc.getDocumentElement().appendChild(pElement);
    }

    @Test
    public void testRemoveClass() {
        String className = "class1";
        Element element = doc.createElement("div", className);
        Element.removeClass(element, className);
        assertEquals("", element.attr("class"));
    }

}