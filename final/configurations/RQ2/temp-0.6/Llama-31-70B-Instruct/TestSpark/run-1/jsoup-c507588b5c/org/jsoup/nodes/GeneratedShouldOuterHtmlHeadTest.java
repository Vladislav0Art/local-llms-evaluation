package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldOuterHtmlHeadTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldOuterHtmlHeadTest() {
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(false);
        textNode.outerHtmlHead(accum, depth, out);
        assertEquals("some text", accum.toString());
    }

}