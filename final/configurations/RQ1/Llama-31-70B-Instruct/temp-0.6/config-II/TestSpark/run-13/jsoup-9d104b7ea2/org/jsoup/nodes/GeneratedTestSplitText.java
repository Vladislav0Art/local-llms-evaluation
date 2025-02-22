package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testSplitText() {
        TextNode textNode2 = textNode.splitText(1);
        assertEquals("t", textNode.getWholeText());
        assertEquals("ext", textNode2.getWholeText());
    }

}