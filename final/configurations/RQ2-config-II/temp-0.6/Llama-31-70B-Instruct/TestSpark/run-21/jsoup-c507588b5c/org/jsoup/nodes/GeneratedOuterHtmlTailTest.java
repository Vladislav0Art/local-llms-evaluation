package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTailTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test text");
    }

    @Test
    public void outerHtmlTailTest() {
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        when(outputSettings.prettyPrint()).thenReturn(false);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, outputSettings);
        assertEquals("", accum.toString());
    }

}