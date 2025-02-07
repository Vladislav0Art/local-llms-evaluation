package org.jsoup.nodes;

public class GeneratedTestSplitTextBlank {

    @Test
    public void testSplitTextBlank() {
        TextNode node = new TextNode("");
        String[] split = node.splitText(0);
        assertEquals("", split[0]);
        assertEquals("", split[1]);
    }

}