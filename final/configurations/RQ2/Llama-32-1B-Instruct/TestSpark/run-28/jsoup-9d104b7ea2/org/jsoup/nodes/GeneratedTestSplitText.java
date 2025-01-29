package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "a b";
        TextNode node = new TextNode(text);
        assertNotNull(node.splitText(1));
        assertEquals("b", node.splitText(1).text());
    }

}