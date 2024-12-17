package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_cloneCreatedTextuallyTest {

    @Test
    public void clone_cloneCreatedTextuallyTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings settings = null;
        TextNode originalNode = new TextNode("Hello World");
        TextNode clonedNode = (TextNode) originalNode.clone();
        assertTrue(outContent.toString().equals("<p>Hello World</p>"));
    }

}