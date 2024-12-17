package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void testBlankText() {
        TestTextNode node = new TestTextNode();
        assertNotNull(node);
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText() {
        Document doc = new Document();
        String text = "<a></a>";
        doc.appendChild(doc.createTextNode(text));
        TextNode result1 = new TestTextNode().splitText(0);
        assertEquals(text, result1.getText());
        TestTextNode result2 = new TestTextNode().splitText(4);
        assertEquals(text.substring(0, 4), result2.getText());
    }

    @Test
    public void testCreateFromEncoded() {
        Document doc = new Document();
        String encodedText = "test";
        TextNode node = TestTextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.getText());
    }

}