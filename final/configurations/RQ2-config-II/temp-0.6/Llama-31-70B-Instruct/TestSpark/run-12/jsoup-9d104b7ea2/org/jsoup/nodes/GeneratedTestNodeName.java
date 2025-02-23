package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNodeName {

    @Mock
    TextNode textNode;

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Node name");
        assertEquals("#text", textNode.nodeName());
    }

}