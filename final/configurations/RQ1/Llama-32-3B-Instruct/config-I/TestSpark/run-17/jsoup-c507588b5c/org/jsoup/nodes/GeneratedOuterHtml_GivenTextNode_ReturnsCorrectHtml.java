package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtml_GivenTextNode_ReturnsCorrectHtml {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void outerHtml_GivenTextNode_ReturnsCorrectHtml() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode.outerHtmlHead(out, 0, settings);
        assertEquals("<p>Hello, World!</p>", out.toString());
    }

}