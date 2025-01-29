package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textNodeWithBlankText {

    @Test
    public void [TextNode][Scenario]Test_textNodeWithBlankText() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals(" ", node.text());
        assertEquals("", node.getText());
    }

}