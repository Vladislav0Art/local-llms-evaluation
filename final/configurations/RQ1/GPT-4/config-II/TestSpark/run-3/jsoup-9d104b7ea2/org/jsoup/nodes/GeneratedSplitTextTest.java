package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("123456");
        TextNode splitted = node.splitText(3);
        assertEquals("123", node.getWholeText());
        assertEquals("456", splitted.getWholeText());
    }

}