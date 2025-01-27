package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedSplitTextMultipleCharacterOffset {

    private Document documentBuilder = new Document();

    @Test
    public void splitTextMultipleCharacterOffset() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result0 = (TextNode) node.splitText(4);
        assertEquals("llo", result0.text());

        TextNode result1 = (TextNode) node.splitText(result0.text().length());
        assertEquals("\nWorld", result1.text());
    }

}