package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetElementsByClass {

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
    public void testGetElementsByClass() {
        String className = "class1 class2";
        List<Element> elements = Element.getElementsByClass(className);
        assertEquals(2, elements.size());
        assertEquals(doc.getDocumentElement(), elements.get(0));
        assertEquals(doc.getDocumentElement().getAttribute("class"), className);
    }

}