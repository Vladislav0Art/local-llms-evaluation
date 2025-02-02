package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsBlank_GivenNonEmptyText_ReturnsFalse {

    @Mock
    private Node parentNode;

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}