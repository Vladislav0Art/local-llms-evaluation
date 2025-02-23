package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTextNode_SplitText_NewTextNode {

    @Test
    public void textNode_SplitText_NewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode expected = new TextNode(" World");
        TextNode actual = textNode.splitText(5);
        assertEquals(expected.getWholeText(), actual.getWholeText());
    }

}