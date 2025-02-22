package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("mockText");
    }

    @Test
    public void outerHtmlHeadTest() {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 1, out);
        assertEquals("mockText", accum.toString());
    }

}