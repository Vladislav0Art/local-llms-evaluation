package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedOuterHtmlHead_GivenTextAndSettingsReturnsCorrectHtml {

    @Test
    public void outerHtmlHead_GivenTextAndSettingsReturnsCorrectHtml() throws IOException {
        String text = "Hello";
        Appendable outContent = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(outContent, 0, settings);
        assertEquals("<p>" + text + "</p>", ((StringBuilder) outContent).toString());
    }

}