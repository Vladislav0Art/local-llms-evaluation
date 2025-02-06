package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedGetWholeText_HasText_ReturnsCorrectWholeText {

    @Test
    public void getWholeText_HasText_ReturnsCorrectWholeText() throws IOException {
        TextNode textNode = new TextNode("example");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.outerHtmlHead(outContent, 0, outputSettings);
        assertEquals("example", textNode.getWholeText());
    }

}