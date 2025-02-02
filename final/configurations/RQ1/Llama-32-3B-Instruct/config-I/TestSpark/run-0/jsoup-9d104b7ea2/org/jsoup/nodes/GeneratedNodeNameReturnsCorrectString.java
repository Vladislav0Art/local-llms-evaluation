package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeNameReturnsCorrectString {

    @Test
    public void nodeNameReturnsCorrectString() {
        // given
        TextNode textNode = new TextNode("test");

        // when
        String nodeName = textNode.nodeName();

        // then
        org.junit.Assert.assertEquals("#text", nodeName);
    }

}