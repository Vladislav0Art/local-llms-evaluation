package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_originalNodeTest {

    @Test
    public void clone_originalNodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        TextNode originalNode = new TextNode("Hello World");
        Document.OutputSettings settings = null;
        originalNode.outerHtmlHead(accum, 0, settings);
        assertTrue(outContent.toString().equals("<p>Hello World</p>"));
        TextNode clonedNode = originalNode.clone();
        assertSame(originalNode, clonedNode);
    }

}