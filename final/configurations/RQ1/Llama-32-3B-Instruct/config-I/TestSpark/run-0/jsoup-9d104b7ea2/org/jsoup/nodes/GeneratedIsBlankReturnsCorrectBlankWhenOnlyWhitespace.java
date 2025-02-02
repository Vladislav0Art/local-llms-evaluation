package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlankReturnsCorrectBlankWhenOnlyWhitespace {

    @Test
    public void isBlankReturnsCorrectBlankWhenOnlyWhitespace() {
        // given
        String text = "   ";
        TextNode textNode = new TextNode(text);

        // when
        boolean blank = textNode.isBlank();

        // then
        org.junit.Assert.assertTrue(blank);
    }

}