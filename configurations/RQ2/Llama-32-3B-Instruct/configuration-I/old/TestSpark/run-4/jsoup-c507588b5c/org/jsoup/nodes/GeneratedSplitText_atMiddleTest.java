package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_atMiddleTest {

    @Test
    public void splitText_atMiddleTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings settings = null;
        TextNode textNode = new TextNode("Hello World");
        TextNode node1 = (TextNode) textNode.splitText(0);
        TextNode node2 = (TextNode) textNode.splitText(textNode.text().length());
        assertTrue(outContent.toString().equals("<p>Hello</p><p>World</p>"));
    }

}