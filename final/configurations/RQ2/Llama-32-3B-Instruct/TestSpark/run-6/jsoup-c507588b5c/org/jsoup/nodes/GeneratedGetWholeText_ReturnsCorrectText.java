package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedGetWholeText_ReturnsCorrectText {

    @Test
    public void getWholeText_ReturnsCorrectText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}