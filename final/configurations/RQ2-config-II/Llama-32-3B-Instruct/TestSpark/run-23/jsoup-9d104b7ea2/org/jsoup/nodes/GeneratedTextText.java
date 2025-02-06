package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedTextText {

    @Test
    public void textText() {
        TextNode textNode = new TextNode("");
        String text = textNode.text("Hello");
        assertEquals("Hello", text);
    }

}