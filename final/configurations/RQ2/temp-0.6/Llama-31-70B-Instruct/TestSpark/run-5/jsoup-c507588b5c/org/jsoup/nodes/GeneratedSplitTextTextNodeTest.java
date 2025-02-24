package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTextNodeTest {

    @Mock
    private TextNode textNode;

    @Test
    public void splitTextTextNodeTest() {
        doReturn(new TextNode("Split Text")).when(textNode).splitText(0);
        assertEquals("Split Text", textNode.splitText(0).text());
    }

}