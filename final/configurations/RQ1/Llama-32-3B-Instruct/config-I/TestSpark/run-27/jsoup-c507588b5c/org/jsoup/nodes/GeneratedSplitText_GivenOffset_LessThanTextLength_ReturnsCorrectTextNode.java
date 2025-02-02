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
public class GeneratedSplitText_GivenOffset_LessThanTextLength_ReturnsCorrectTextNode {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void splitText_GivenOffset_LessThanTextLength_ReturnsCorrectTextNode() {
        int offset = 5;
        String text = "Hello World";
        String tail = getTextNode().splitText(offset).text();
        assertEquals(text.substring(0, offset) + "\n" + tail, tail);
    }

}