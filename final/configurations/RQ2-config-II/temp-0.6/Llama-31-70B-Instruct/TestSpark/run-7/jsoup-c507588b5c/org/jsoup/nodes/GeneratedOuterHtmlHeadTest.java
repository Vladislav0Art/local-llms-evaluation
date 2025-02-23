package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.outerHtmlHead(Mockito.any(), Mockito.anyInt(), Mockito.any())).thenReturn(null);
        textNode.outerHtmlHead(null, 0, null);
    }

}