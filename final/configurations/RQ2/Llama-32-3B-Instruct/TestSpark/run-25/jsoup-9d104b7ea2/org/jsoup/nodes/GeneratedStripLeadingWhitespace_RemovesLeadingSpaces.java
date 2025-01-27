package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedStripLeadingWhitespace_RemovesLeadingSpaces {

    @Test
    public void stripLeadingWhitespace_RemovesLeadingSpaces() {
        String text = "  Hello   World ";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

}