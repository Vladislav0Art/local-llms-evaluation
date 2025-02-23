package org.jsoup.nodes;

import static org.jsoup.nodes.TextNode.createFromEncoded;
import static org.jsoup.nodes.TextNode.normaliseWhitespace;
import static org.jsoup.nodes.TextNode.stripLeadingWhitespace;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("text");
    }

    @Test
    public void testSplitText() {
        TextNode tailNode = textNode.splitText(2);
        assertEquals("te", textNode.coreValue());
        assertEquals("xt", tailNode.coreValue());
    }

}