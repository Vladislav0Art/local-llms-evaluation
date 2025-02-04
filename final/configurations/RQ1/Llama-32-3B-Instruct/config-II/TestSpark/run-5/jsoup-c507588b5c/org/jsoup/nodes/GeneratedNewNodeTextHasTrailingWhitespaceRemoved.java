package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedNewNodeTextHasTrailingWhitespaceRemoved {

    @Test
    public void newNodeTextHasTrailingWhitespaceRemoved() {
        TextNode textNode = new TextNode("Hello World!   ");
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, StringUtil.stripLeadingWhitespace(textNode.text()));
    }

}