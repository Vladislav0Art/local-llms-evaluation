package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeSplitTextTest {

    @Test
    public void TextNodeSplitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitText = textNode.splitText(2);
        assertEquals("xt", splitText.text());
    }

}