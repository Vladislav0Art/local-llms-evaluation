package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedText_SetCorrectValue {

    @Test
    public void text_SetCorrectValue() {
        TextNode textNode = new TextNode("Some text");
        textNode.text("New text");
        assertEquals("New text", textNode.text());
    }

}