package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedText_setText_ReturnsUpdatedText {

    @Test
    public void text_setText_ReturnsUpdatedText() {
        TextNode textNode = new TextNode("");
        textNode.text("Hello");
        assertEquals("Hello", textNode.text());
    }

}