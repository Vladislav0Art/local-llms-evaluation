package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedNewNodeTextIsNotBlankIfContainsNonWhitespace {

    @Test
    public void newNodeTextIsNotBlankIfContainsNonWhitespace() {
        TextNode textNode = new TextNode("Hello World!");
        assertFalse(textNode.isBlank());
    }

}