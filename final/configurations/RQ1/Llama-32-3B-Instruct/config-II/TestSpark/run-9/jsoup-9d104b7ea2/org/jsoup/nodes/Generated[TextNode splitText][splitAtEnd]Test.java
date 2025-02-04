package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
TextNode splitText][splitAtEnd]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [TextNode splitText][splitAtEnd]Test() {
        final String originalText = "Hello World";
        int offset = originalText.length();
        TextNode result = textNode.splitText(offset);
        assertEquals(originalText, result.getWholeText());
    }

}