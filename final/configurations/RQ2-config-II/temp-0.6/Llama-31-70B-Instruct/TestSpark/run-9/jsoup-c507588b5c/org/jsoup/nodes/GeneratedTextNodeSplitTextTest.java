package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextNodeSplitTextTest {

    @Mock
    TextNode textNode;

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("Some Text");
        TextNode textNode2 = textNode.splitText(4);
        assertEquals("Text", textNode2.coreValue());
        assertEquals("Some ", textNode.coreValue());
    }

}