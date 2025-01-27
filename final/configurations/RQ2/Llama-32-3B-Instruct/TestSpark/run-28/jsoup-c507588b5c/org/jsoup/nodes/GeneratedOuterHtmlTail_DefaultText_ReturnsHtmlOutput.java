package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlTail_DefaultText_ReturnsHtmlOutput {

    @Test
    public void outerHtmlTail_DefaultText_ReturnsHtmlOutput() throws IOException {
        TextNode textNode = new TextNode("Default text");
        Appendable appendable = new StringBuilder();
        textNode.outerHtmlTail(appendable, 0, new Document.OutputSettings());
        assertTrue(appendable.toString().contains("</p><p>Default text</p>"));
    }

}