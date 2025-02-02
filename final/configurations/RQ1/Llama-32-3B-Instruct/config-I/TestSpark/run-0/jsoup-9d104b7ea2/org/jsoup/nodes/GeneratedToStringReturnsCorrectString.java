package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedToStringReturnsCorrectString {

    @Test
    public void toStringReturnsCorrectString() {
        // given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // when
        String toString = textNode.toString();

        // then
        org.junit.Assert.assertEquals(toString, "test");
    }

}