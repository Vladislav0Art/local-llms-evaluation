package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedOuterHtmlTail_GivenTextAndSettingsReturnsCorrectHtml {

    @Test
    public void outerHtmlTail_GivenTextAndSettingsReturnsCorrectHtml() {
        String text = "Hello";
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        StringBuilder outContent = new StringBuilder();
        textNode.outerHtmlTail(outContent, 0, settings);
        assertEquals("", outContent.toString());
    }

}