package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedStripLeadingWhitespace_StripsTrailingSpaces {

    @Test
    public void stripLeadingWhitespace_StripsTrailingSpaces() {
        String text = "   Hello World!";
        String strippedText = TextNode.normaliseWhitespace(text);
        assertEquals("Hello World!", strippedText);
    }

}