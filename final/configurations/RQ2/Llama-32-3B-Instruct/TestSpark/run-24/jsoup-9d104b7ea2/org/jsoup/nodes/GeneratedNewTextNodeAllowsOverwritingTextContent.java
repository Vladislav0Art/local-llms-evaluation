package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;

public class GeneratedNewTextNodeAllowsOverwritingTextContent {

    public String stripLeadingWhitespace(String input) {
        return input.replaceAll("^\\s+", "");
    }

    @Test
    public void newTextNodeAllowsOverwritingTextContent() {
        TextNode textNode = new TextNode("Hello, World!");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}