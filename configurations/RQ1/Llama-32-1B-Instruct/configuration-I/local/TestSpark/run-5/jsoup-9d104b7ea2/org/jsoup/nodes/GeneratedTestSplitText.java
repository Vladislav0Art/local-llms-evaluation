package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private static String html = "<p>  Hello World  </p>";

    @Test
    public void testSplitText() {
        TextNode root = new TextNode(html);
        TextNode node1 = root.splitText(10);
        String expectedText = "Hello World";
        assertEquals(expectedText, node1.getText());
    }

}