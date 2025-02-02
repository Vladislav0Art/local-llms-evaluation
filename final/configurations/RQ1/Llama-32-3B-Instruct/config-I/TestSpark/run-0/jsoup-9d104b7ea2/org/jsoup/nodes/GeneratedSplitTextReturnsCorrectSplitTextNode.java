package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitTextReturnsCorrectSplitTextNode {

    @Test
    public void splitTextReturnsCorrectSplitTextNode() {
        // given
        String text = "test";
        int offset = 5;

        // when
        TextNode textNode = new TextNode(text);

        // then
        TextNode expectedTextNode = new TextNode("tes");
        org.junit.Assert.assertEquals(expectedTextNode, textNode.splitText(offset));
    }

}