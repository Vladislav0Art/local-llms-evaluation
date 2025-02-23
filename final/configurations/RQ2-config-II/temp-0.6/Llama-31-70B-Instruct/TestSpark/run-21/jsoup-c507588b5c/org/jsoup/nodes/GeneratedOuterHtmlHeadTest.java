package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test text");
    }

    @Test
    public void outerHtmlHeadTest() {
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        when(outputSettings.prettyPrint()).thenReturn(false);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, outputSettings);
        assertEquals("test text", accum.toString());
    }

}