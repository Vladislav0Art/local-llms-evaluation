package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSplitText {

    @Mock
    TextNode textNode;

    @Test
    public void testSplitText() {
        String text = "Split text test";
        TextNode textNode = new TextNode(text);
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Split", textNode.getWholeText());
        assertEquals("text test", splitTextNode.getWholeText());
    }

}