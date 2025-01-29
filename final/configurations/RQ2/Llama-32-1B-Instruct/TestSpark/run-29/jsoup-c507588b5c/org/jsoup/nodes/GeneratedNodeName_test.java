package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

}