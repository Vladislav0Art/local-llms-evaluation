package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedStripLeadingWhitespaceRemovesLeadingWhitespacesTest {

    @Test
    public void stripLeadingWhitespaceRemovesLeadingWhitespacesTest() {
        String text = "   test";
        assertEquals("test", TextNode.stripLeadingWhitespace(text));
    }

}