package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTestSplitText {

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

}