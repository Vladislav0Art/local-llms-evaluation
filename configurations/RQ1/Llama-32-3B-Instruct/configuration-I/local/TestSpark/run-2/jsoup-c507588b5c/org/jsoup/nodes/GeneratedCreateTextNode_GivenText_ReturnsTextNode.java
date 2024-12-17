package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

}