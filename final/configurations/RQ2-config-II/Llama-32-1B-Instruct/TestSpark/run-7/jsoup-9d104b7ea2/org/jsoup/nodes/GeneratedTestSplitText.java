package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World\nThis is a test");
        String[] split = node.splitText(0);
        assertEquals("Hello ", split[0]);
        assertEquals("World \nThis is a test", split[1]);
    }

}