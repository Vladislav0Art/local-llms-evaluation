package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
TextNode splitText][splitInMiddle]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [TextNode splitText][splitInMiddle]Test() {
        final String originalText = "Hello World";
        int offset = 5;
        TextNode result = textNode.splitText(offset);
        assertEquals("World", result.getWholeText());
    }

}