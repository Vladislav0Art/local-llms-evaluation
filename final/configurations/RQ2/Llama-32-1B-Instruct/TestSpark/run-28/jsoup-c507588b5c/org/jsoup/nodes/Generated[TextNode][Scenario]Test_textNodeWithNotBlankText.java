package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textNodeWithNotBlankText {

    @Test
    public void [TextNode][Scenario]Test_textNodeWithNotBlankText() {
        String text = "Hello";
        TextNode node = new TextNode(text);
        assertEquals("Hello", node.text());
        assertEquals("H", node.getText());
    }

}