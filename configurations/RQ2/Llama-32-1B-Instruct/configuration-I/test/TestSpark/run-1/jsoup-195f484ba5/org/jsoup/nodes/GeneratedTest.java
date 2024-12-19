package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element("div");
        element.addAttribute("id", "test");
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testNoChildNodes() {
        Element element = new Element("p");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element("input");
        element.addAttribute("type", "text");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void testNoAttributes() {
        Element element = new Element("span");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void testText() {
        Element element = new Element("<p>This is a paragraph of text</p>");
        assertTrue(element.text().length() > 0);
    }

    @Test
    public void testWholeText() {
        Element element = new Element("<p>This is the whole text of this paragraph.</p>");
        String wholeText = element.wholeText();
        assertTrue(wholeText.length() > 0);
    }

    @Test
    public void testOwnText() {
        Element element = new Element("<div><span>Test span</span></div>");
        String ownText = element.ownText();
        assertTrue(ownText.length() > 0);
    }

    @Test
    public void testData() {
        Element element = new Element("<p data-value='test'>This is a paragraph of text.</p>");
        assertEquals("test", element.data());
    }

    @Test
    public void testClassName() {
        Element element = new Element("<span class='test-class'>This is a span with the test-class class</span>");
        String className = element.className();
        assertTrue(className.contains("test-class"));
    }

    @Test
    public void testNoClass() {
        Element element = new Element("span");
        assertEquals("", element.className());
    }

    @Test
    public void testShouldIndent() {
        Document document = new Document();
        document.outputSettings().indentLevel = 4;
        assertTrue(Element.shouldIndent(document, 0));
    }

    @Test
    public void testOuterHtmlHead() {
        Element element = new Element("<div></div>");
        element.outerHtmlHead(null, 0);
        assertEquals("<div></div>", element.outerHtml());
    }

}