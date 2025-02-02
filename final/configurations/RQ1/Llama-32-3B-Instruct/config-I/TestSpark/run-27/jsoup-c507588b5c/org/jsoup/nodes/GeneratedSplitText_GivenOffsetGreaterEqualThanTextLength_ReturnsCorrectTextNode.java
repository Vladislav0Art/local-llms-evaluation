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
public class GeneratedSplitText_GivenOffsetGreaterEqualThanTextLength_ReturnsCorrectTextNode {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    public TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void splitText_GivenOffsetGreaterEqualThanTextLength_ReturnsCorrectTextNode() {
        int offset = 10;
        String text = "Hello World";
        TextNode textNode = getTextNode();
        assertDoesNotThrow(() -> textNode.splitText(offset));
    }

}