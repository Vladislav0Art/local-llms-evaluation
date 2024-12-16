package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest_OffsetAtEnd {

    @Test
    public void splitTextTest_OffsetAtEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(textNode.text().length());
        assertEquals("", textNode.text());
        assertEquals("test", result.text());
    }

}