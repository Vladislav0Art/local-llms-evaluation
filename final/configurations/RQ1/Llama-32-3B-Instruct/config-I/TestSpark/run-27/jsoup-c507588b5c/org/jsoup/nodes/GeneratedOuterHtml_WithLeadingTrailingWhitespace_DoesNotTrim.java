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
public class GeneratedOuterHtml_WithLeadingTrailingWhitespace_DoesNotTrim {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void outerHtml_WithLeadingTrailingWhitespace_DoesNotTrim() {
        Document document = new Document();
        Appendable appendable = new StringBuilder();
        int depth = 0;
        String text = "   Hello World  ";
        TextNode textNode = getTextNode();
        Document.OutputSettings out = new Document.OutputSettings();
        boolean prettyPrint = true;
        out.prettyPrint();
        Node node = document.createTextNode("Hello World");
        textNode.parentNode().appendChild(node);
        textNode.outerHtmlHead(appendable, depth, out);
        assertTrue(!appendable.toString().equals("   Hello World  "));
    }

}