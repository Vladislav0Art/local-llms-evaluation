package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceMethodStripsLeadingWhitespaceCorrectlyTest {

    @Test
    public void stripLeadingWhitespaceMethodStripsLeadingWhitespaceCorrectlyTest() {
        String text = "\tHello World\n";
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, TextNode.stripLeadingWhitespace(text));
    }

}