package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedNormaliseWhitespaceRemovesLeadingWhitespacesTest {

    @Test
    public void normaliseWhitespaceRemovesLeadingWhitespacesTest() {
        String text = "   test";
        assertEquals("test", TextNode.normaliseWhitespace(text));
    }

}