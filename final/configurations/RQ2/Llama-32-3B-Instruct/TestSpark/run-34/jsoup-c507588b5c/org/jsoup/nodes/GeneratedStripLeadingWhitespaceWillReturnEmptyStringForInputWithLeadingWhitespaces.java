package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedStripLeadingWhitespaceWillReturnEmptyStringForInputWithLeadingWhitespaces {

    @Test
    public void stripLeadingWhitespaceWillReturnEmptyStringForInputWithLeadingWhitespaces() {
        String input = "   text";
        String expected = "";
        assertEquals(expected, TextNode.stripLeadingWhitespace(input));
    }

}