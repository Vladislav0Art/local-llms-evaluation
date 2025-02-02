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
public class GeneratedTextSet_GivenBlankText_SetCorrectly {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void textSet_GivenBlankText_SetCorrectly() {
        TextNode textNode = getTextNode();
        textNode.text("");
        assertTrue(textNode.text().isEmpty());
    }

}