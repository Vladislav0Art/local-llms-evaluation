package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedGetWholeText_GivenTextNode_ReturnsWholeText {

    @Test
    public void getWholeText_GivenTextNode_ReturnsWholeText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.getWholeText());
    }

}