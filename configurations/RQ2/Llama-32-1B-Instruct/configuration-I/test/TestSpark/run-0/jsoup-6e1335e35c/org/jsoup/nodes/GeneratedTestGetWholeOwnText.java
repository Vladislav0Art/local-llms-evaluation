package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetWholeOwnText {

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
    public void testGetWholeOwnText() {
        String wholeOwnText = Element.html(doc).wholeOwnText();
        assertEquals("<p>Hello World!</p>", wholeOwnText);
    }

}