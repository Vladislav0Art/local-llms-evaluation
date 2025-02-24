package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeSplitTextTest {

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("Some text");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("me text", splitTextNode.text());
    }

}