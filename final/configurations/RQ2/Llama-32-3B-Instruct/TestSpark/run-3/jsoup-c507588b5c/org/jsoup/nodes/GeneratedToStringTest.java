package org.jsoup.nodes;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("test");
        assertEquals("<text>test</text>", node.toString());
    }

}