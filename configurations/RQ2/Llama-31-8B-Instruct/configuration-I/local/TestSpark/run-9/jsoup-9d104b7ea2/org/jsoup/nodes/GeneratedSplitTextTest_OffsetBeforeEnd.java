package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest_OffsetBeforeEnd {

    @Test
    public void splitTextTest_OffsetBeforeEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", result.text());
    }

}