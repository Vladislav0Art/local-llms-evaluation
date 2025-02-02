package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlankReturnsCorrectBlankValue {

    @Test
    public void isBlankReturnsCorrectBlankValue() {
        // given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // when
        boolean blank = textNode.isBlank();

        // then
        org.junit.Assert.assertFalse(blank);
    }

}