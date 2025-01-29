package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("test");
        int offset = 2;
        assertNotNull(node.splitText(offset));
        assertEquals(3, node.splitText(offset).text().length());
    }

}