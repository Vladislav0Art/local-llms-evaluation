package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceRemovesLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceRemovesLeadingWhitespaceTest() {
        String input = "   Hello World";
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, TextNode.stripLeadingWhitespace(input));
    }

}