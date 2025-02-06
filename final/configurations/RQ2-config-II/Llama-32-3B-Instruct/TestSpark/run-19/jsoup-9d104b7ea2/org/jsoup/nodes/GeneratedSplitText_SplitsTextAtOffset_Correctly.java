package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitText_SplitsTextAtOffset_Correctly {

    @Test
    public void splitText_SplitsTextAtOffset_Correctly() {
        TextNode node = new TextNode("Hello World");
        TextNode result = node.splitText(6);
        assertEquals("World", result.text());
    }

}