package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeTextReturnsCorrectWholeText {

    @Test
    public void getWholeTextReturnsCorrectWholeText() {
        // given
        String text = "test";

        // when
        TextNode textNode = new TextNode(text);

        // then
        org.junit.Assert.assertEquals("test", textNode.getWholeText());
    }

}