package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedTextString {

    @Test
    public void textString() {
        TextNode textNode = new TextNode("Hello");
        String text = textNode.text();
        assertEquals("Hello", text);
    }

}