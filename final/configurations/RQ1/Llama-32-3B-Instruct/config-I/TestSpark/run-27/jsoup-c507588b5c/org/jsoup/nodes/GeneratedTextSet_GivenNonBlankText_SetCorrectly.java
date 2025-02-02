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
public class GeneratedTextSet_GivenNonBlankText_SetCorrectly {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void textSet_GivenNonBlankText_SetCorrectly() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}