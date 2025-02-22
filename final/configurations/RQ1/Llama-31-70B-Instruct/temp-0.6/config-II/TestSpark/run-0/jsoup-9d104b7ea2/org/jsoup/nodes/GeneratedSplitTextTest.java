package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        TextNode tailNode = textNode.splitText(1);
        assertEquals("&", textNode.getWholeText());
        assertEquals("lt;", tailNode.getWholeText());
    }

}