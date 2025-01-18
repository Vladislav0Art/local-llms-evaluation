package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   sample text   ";
        text = TextNode.stripLeadingWhitespace(text);
        assertEquals("sample text   ", text);
    }

}