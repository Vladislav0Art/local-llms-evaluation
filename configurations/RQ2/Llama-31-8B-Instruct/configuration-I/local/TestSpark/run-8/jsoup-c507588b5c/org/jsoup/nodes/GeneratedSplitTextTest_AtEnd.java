package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest_AtEnd {

    @Test
    public void splitTextTest_AtEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(5);
        assertEquals("test", textNode.text());
        assertEquals("", result.text());
    }

}