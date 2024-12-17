package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextAtEndOfTextTest {

    @Test
    public void splitTextAtEndOfTextTest() {
        TextNode node = new TextNode("Hello World");
        int length = node.length();
        int offset = 0;
        while (offset < length) {
            TextNode splitNode = node.splitText(offset);
            assertNotEquals(node, splitNode);
            break;
        }
    }

}