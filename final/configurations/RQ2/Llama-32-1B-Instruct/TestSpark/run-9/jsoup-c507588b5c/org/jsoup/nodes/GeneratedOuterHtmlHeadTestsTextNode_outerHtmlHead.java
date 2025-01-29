package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTestsTextNode_outerHtmlHead {

    @Test
    public void outerHtmlHeadTestsTextNode_outerHtmlHead() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document outputSettings = new org.w3c.dom.Document();
        when(node.outerHtmlHead(accum, depth, outputSettings)).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.outerHtmlHead(accum, depth, outputSettings));
    }

}