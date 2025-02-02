package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsBlank_GivenTextNode_ReturnsTrue {

    @Mock
    private Node parentNode;

    @Test
    public void isBlank_GivenTextNode_ReturnsTrue() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}