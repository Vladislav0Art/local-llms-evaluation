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
public class GeneratedClone_ReturnsCorrectTextNode {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        TextNode textNode = getTextNode();
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

}