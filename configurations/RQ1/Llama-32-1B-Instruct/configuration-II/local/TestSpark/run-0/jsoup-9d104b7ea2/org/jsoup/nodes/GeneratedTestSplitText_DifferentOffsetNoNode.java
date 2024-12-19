package org.jsoup.nodes;

public class GeneratedTestSplitText_DifferentOffsetNoNode {

    @Test
    public void testSplitText_DifferentOffsetNoNode() {
        String text = "   hello   \\n  world  \\\\n   ";
        assertEquals(null, TextNode.splitText(4));
    }

}