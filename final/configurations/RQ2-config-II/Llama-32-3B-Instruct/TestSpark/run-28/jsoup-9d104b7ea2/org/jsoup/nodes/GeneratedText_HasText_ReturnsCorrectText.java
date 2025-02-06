package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedText_HasText_ReturnsCorrectText {

    @Test
    public void text_HasText_ReturnsCorrectText() {
        TextNode textNode = new TextNode("example");
        assertEquals("example", textNode.text());
    }

}