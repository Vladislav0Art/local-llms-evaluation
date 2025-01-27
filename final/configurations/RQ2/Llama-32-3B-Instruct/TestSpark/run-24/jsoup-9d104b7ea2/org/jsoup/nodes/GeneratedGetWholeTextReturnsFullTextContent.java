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

public class GeneratedGetWholeTextReturnsFullTextContent {

    public String stripLeadingWhitespace(String input) {
        return input.replaceAll("^\\s+", "");
    }

    @Test
    public void getWholeTextReturnsFullTextContent() throws IOException {
        Document doc = new Document("<p>Hello\nWorld</p>");
        Elements elements = doc.select("p");
        TextNode textNode = (TextNode) elements.get(0);
        String wholeText = textNode.getWholeText();
        assertNotNull(wholeText);
        assertTrue(wholeText.contains("Hello"));
        assertTrue(wholeText.contains("World"));
    }

}