package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlReturnsCorrectHtmlForNonBlankTextNode {

    @Test
    public void outerHtmlReturnsCorrectHtmlForNonBlankTextNode() {
        String text = "Hello World";
        Document document = new Document();
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        TextNode node = new TextNode(text);
        node.outerHtmlHead(accum, depth, document.outputSettings());
        String html = accum.toString();
        assertTrue(html.contains("<html>"));
    }

}