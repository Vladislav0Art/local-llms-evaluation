package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode splitNode = textNode.splitText(2);

        assertEquals("Te", textNode.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}