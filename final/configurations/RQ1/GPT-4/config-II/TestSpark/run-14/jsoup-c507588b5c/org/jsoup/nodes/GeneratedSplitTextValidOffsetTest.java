package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextValidOffsetTest {

    @Test
    public void splitTextValidOffsetTest() {
        TextNode textNode = new TextNode("split text");
        TextNode newTextNode = textNode.splitText(5);
        assertEquals("split", textNode.getWholeText());
        assertEquals(" text", newTextNode.getWholeText());
    }

}