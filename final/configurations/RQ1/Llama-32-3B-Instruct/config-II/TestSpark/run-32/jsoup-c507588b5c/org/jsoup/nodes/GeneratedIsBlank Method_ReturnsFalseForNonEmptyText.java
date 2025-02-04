package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedIsBlank Method_ReturnsFalseForNonEmptyText {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void isBlank

    Method_ReturnsFalseForNonEmptyText() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        boolean result = textNode.isBlank();
        org.junit.Assert.assertFalse(result);
    }

}