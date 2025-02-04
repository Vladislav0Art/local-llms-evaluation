package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedNewNodeTextHasLeadingWhitespaceRemoved {

    @Test
    public void newNodeTextHasLeadingWhitespaceRemoved() {
        TextNode textNode = new TextNode("   Hello World!");
        String expectedOutput = "Hello World!";
        assertEquals(expectedOutput, StringUtil.stripLeadingWhitespace(textNode.text()));
    }

}