package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextAtStartOfTextTest {

    @Test
    public void splitTextAtStartOfTextTest() {
        TextNode node = new TextNode("");
        TextNode splitNode = node.splitText(0);
        assertNull(splitNode);
    }

}