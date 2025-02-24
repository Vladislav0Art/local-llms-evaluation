package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("testTextNode");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 1, Mockito.mock(Document.OutputSettings.class));
        assertEquals("testTextNode", accum.toString());
    }

}