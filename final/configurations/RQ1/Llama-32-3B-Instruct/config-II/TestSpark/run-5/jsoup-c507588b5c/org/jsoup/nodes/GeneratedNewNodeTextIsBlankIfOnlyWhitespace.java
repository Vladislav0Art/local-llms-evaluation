package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedNewNodeTextIsBlankIfOnlyWhitespace {

    @Test
    public void newNodeTextIsBlankIfOnlyWhitespace() {
        TextNode textNode = new TextNode(" \t\n");
        assertTrue(textNode.isBlank());
    }

}