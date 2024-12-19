package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSplitText_splitsAtOffset {

    @Test
    public void testSplitText_splitsAtOffset() {
        Node node = new TextNode("a b c");
        node.text("   ");
        assertTrue(node.splitText(2).isBlank());
    }

}