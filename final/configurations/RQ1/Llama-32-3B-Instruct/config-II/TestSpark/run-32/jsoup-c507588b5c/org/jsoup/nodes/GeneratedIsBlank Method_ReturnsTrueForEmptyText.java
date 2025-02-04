package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedIsBlank Method_ReturnsTrueForEmptyText {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void isBlank

    Method_ReturnsTrueForEmptyText() {
        TextNode textNode = new TextNode("");
        boolean result = textNode.isBlank();
        org.junit.Assert.assertTrue(result);
    }

}