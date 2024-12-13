package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest_OffsetEnd {

    @Test
    public void splitTextTest_OffsetEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(3);
        assertEquals("te", textNode.text());
        assertEquals("st", result.text());
    }

}