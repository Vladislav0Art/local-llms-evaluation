package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtml_WithNoLeadingTrailingWhitespace_ReturnsCorrectString {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void outerHtml_WithNoLeadingTrailingWhitespace_ReturnsCorrectString() {
        Document document = new Document();
        Appendable appendable = new StringBuilder();
        int depth = 0;
        String text = "Hello World";
        TextNode textNode = getTextNode();
        Document.OutputSettings out = new Document.OutputSettings();
        boolean prettyPrint = true;
        out.prettyPrint();
        Node node = document.createTextNode("Hello World");
        textNode.parentNode().appendChild(node);
        textNode.outerHtmlHead(appendable, depth, out);
        assertEquals(appendable.toString(), "<p>Hello World</p>");
    }

}