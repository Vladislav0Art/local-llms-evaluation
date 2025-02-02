package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedSplitText_NegativeOffset_ThrowsInvalidArgumentException {

    @Test
    public void splitText_NegativeOffset_ThrowsInvalidArgumentException() {
        try {
            TextNode textNode = new TextNode("Hello World");
            textNode.splitText(-1);
            fail();
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}