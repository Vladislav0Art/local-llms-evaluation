package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textIsBlank {

    @Test
    public void [TextNode][Scenario]Test_textIsBlank() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        assertTrue(node.isBlank());
    }

}