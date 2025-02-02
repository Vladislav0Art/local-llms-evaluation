package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Mock
    private Node parentNode;

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Mockito.verify(textNode).value(text);
    }

}