package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textDoesNotHaveTrailingWhitespace {

    @Test
    public void [TextNode][Scenario]Test_textDoesNotHaveTrailingWhitespace() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        assertFalse(node.isBlank());
    }

}