package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextSetsCorrectText {

    @Test
    public void textSetsCorrectText() {
        // given
        String text = "test";
        TextNode textNode = new TextNode();

        // when
        textNode.text(text).text(text);

        // then
        org.junit.Assert.assertEquals(text, textNode.text());
    }

}