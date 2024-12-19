package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedStripLeadingWhitespace_testStringWithMultipleSpacesTest {

    @Test
    public void stripLeadingWhitespace_testStringWithMultipleSpacesTest() {
        String testString = "   ";
        String result = TextNode.stripLeadingWhitespace(testString);
        assertTrue(result.equals(" "));
    }

}