package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedSplitTextSingleCharacterOffset {

    private Document documentBuilder = new Document();

    @Test
    public void splitTextSingleCharacterOffset() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result1 = (TextNode) node.splitText(0);
        assertEquals("Hello", result1.text());
        assertEquals("\n", result1.getWholeText());

        TextNode result2 = (TextNode) node.splitText(node.text().length() - 1);
        assertEquals("\nWorld", result2.text());
    }

}