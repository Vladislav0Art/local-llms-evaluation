package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedText_NoText_ReturnsEmptyString {

    @Test
    public void text_NoText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}