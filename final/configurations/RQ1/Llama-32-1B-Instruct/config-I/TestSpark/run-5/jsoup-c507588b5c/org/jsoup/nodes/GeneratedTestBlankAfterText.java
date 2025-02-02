package org.jsoup.nodes;

public class GeneratedTestBlankAfterText {

    @Test
    public void testBlankAfterText() {
        String text = "Hello World!";
        TextNode node = new TextNode("   \n\t\r\n");
        assertTrue(node.isBlank());
    }

}