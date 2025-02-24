package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeNameTextNodeTest {

    @Mock
    private TextNode textNode;

    @Test
    public void nodeNameTextNodeTest() {
        doReturn("#text").when(textNode).nodeName();
        assertEquals("#text", textNode.nodeName());
    }

}