package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedGetWholeText_NoText_ReturnsEmptyString {

    @Test
    public void getWholeText_NoText_ReturnsEmptyString() throws IOException {
        TextNode textNode = new TextNode("");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.outerHtmlHead(outContent, 0, outputSettings);
        assertEquals("", textNode.getWholeText());
    }

}