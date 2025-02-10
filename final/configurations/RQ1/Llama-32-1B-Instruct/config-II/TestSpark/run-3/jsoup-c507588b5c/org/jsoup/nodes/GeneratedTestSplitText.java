package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "   \n\t  \n";
        TextNode node1 = new TextNode(text);
        TextNode node2 = node1.splitText(5);
        assertTrue(node2.getText().contains("World!"));
        assertNotNull(node2.getWholeText());
    }

}