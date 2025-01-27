package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedNodeName_GivenTextNode_ReturnsTextNodeName {

    @Test
    public void nodeName_GivenTextNode_ReturnsTextNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

}