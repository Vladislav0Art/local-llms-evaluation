package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_splitText {

    @Test
    public void [TextNode][Scenario]Test_splitText() {
        String text = "Hello World";
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = new TextNode("World");
        TextNode result = new TextNode(node1.text().split("\n")[0].trim());
        assertEquals("Hello\n", result.getText());
    }

}