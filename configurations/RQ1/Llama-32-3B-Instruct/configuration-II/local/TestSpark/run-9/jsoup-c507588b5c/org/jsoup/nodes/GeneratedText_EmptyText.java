package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedText_EmptyText {

    @Test
    public void text_EmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.text().isEmpty());
    }

}