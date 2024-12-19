package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

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
    public void testGetText() {
        String text = Element.html(doc).text();
        assertEquals("Hello World!", text);
    }

    @Test
    public void testGetWholeText() {
        String wholeText = Element.html(doc).wholeText();
        assertEquals("<p>Hello World!</p>", wholeText);
    }

    @Test
    public void testGetOwnText() {
        String ownText = Element.html(doc).ownText();
        assertEquals("Hello World!", ownText);
    }

    @Test
    public void testHasText() {
        boolean hasText = Element.hasText(doc);
        assertTrue(hasText);
    }

    @Test
    public void testGetWholeOwnText() {
        String wholeOwnText = Element.html(doc).wholeOwnText();
        assertEquals("<p>Hello World!</p>", wholeOwnText);
    }

    @Test
    public void testHasClass() {
        boolean hasClass = Element.hasClass("class1");
        assertTrue(hasClass);
    }

    @Test
    public void testAddClass() {
        String className = "class2";
        Element element = doc.createElement("div", className);
        Element.addClass(element, className);
        assertEquals("class1 class2", element.attr("class"));
    }

    @Test
    public void testRemoveClass() {
        String className = "class1";
        Element element = doc.createElement("div", className);
        Element.removeClass(element, className);
        assertEquals("", element.attr("class"));
    }

    @Test
    public void testToggleClass() {
        String className = "class1";
        Element element = doc.createElement("div", className);
        Element.toggleClass(element, className);
        assertEquals("class2 class1", element.attr("class"));
    }

    @Test
    public void testGetElementsByTag() {
        String tagName = "p";
        List<Element> elements = Element.getElementsByTag(tagName);
        assertEquals(1, elements.size());
        assertEquals(doc.getDocumentElement(), elements.get(0));
    }

    @Test
    public void testGetElementsByClass() {
        String className = "class1 class2";
        List<Element> elements = Element.getElementsByClass(className);
        assertEquals(2, elements.size());
        assertEquals(doc.getDocumentElement(), elements.get(0));
        assertEquals(doc.getDocumentElement().getAttribute("class"), className);
    }

    @Test
    public void testGetElementsByAttribute() {
        String attributeKey = "id";
        List<Element> elements = Element.getElementsByAttribute(attributeKey, doc.id());
        assertEquals(1, elements.size());
        assertEquals(doc.getDocumentElement(), elements.get(0));
    }

}