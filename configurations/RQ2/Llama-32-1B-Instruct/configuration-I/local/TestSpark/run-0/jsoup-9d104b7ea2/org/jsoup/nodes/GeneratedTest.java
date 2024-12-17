package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void testToString() {
        String text = "This is a paragraph.";
        Document doc = new Document();
        Element root = doc.createElement("div");
        root.appendChild(doc.createElement("p"));
        root.appendChild(doc.createElement("span"));
        root.appendChild(doc.createElement("a"));
        root.appendChild(doc.createElement("b"));
        root.appendChild(doc.createElement("i"));
        String nodeText = "This is a paragraph.";
        String result = (String) ((Element) root).text(nodeText);
        assertEquals("TextNode[0]", result);
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "   \n";
        Document doc = new Document();
        Element root = doc.createElement("div");
        root.appendChild(doc.createElement("p"));
        root.appendChild(doc.createElement("span"));
        String nodeText = "   \n";
        String result = ((Element) root).text(nodeText);
        assertEquals("\\n", result);
    }

    @Test
    public void testStripLeadingWhitespace() {
        String text = "\\n";
        Document doc = new Document();
        Element root = doc.createElement("div");
        root.appendChild(doc.createElement("p"));
        root.appendChild(doc.createElement("span"));
        String nodeText = "\\n";
        String result = ((Element) root).text(nodeText);
        assertEquals("\\n", result);
    }

    @Test
    public void testLastCharIsWhitespace() {
        String text = "abc";
        Document doc = new Document();
        Element root = doc.createElement("div");
        root.appendChild(doc.createElement("p"));
        root.appendChild(doc.createElement("span"));
        String nodeText = "abc";
        boolean result = ((Element) root).lastCharIsWhitespace(nodeText);
        assertTrue(result);
    }

}