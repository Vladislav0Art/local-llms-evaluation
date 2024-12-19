package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedIsBlank_EmptyText {

    @Test
    public void isBlank_EmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}