package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTextReturnsTextContentTest {

    @Test
    public void textReturnsTextContentTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
        assertEquals(text, node.getWholeText());
    }

}