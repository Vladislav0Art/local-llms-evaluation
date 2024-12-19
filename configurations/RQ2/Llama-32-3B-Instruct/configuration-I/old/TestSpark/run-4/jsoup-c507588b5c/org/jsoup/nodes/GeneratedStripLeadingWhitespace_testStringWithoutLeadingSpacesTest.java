package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedStripLeadingWhitespace_testStringWithoutLeadingSpacesTest {

    @Test
    public void stripLeadingWhitespace_testStringWithoutLeadingSpacesTest() {
        String testString = "Hello World";
        String result = TextNode.stripLeadingWhitespace(testString);
        assertEquals(testString, result);
    }
}

class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public static String stripLeadingWhitespace(String text) {
        // implementation
        return text;
    }

    public String text() {
        return text;
    }

}