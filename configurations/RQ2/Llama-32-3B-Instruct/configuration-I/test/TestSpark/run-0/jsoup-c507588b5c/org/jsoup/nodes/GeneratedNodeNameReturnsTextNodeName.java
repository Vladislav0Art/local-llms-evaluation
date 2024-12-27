package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeNameReturnsTextNodeName {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public static final String document_OUTPUT_SETTINGS = "outputSettings";

    @Test
    public void nodeNameReturnsTextNodeName() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("text-node", textNode.nodeName());
    }

}