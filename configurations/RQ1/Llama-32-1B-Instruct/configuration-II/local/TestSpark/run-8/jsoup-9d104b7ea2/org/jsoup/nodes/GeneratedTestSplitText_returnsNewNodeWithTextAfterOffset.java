package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText_returnsNewNodeWithTextAfterOffset {

    @Test
    public void testSplitText_returnsNewNodeWithTextAfterOffset() {
        Node node = new TextNode("a b c");
        node.text("   ");
        String text = "";
        TextNode result = node.splitText(2);
        assertTrue(result.text().isEmpty());
        assertEquals(node, result);
    }

}