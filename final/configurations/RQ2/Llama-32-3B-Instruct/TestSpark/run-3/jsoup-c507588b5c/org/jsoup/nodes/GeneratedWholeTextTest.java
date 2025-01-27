package org.jsoup.nodes;

public class GeneratedWholeTextTest {

    @Test
    public void wholeTextTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

}