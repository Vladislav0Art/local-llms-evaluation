package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithLeadingWhitespace = "    Strip this leading whitespace";
        assertEquals("Strip this leading whitespace", TextNode.stripLeadingWhitespace(textWithLeadingWhitespace));
    }

}