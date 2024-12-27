package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedStripLeadingWhitespace_EmptyString_ReturnsEmptyString {

    @Test
    public void stripLeadingWhitespace_EmptyString_ReturnsEmptyString() {
        String text = "";
        String strippedText = TextNode.normaliseWhitespace(text);
        assertEquals("", strippedText);
    }
}

}