package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedStripLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace() {
        String leadingWhitespaces = "   Hello World";
        String strippedText = TextNode.stripLeadingWhitespace(leadingWhitespaces);
        assertEquals("Hello World", strippedText);
    }

}