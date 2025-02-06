package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneCreatesNewTextNode {

    @Test
    public void cloneCreatesNewTextNode() throws IOException {
        String expectedText = "cloneText";
        TextNode textNode = new TextNode(expectedText);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = null;
        TextNode result = textNode.clone();
        assertTrue(result != null);
        assertEquals("cloneText", result.getWholeText());
    }

}