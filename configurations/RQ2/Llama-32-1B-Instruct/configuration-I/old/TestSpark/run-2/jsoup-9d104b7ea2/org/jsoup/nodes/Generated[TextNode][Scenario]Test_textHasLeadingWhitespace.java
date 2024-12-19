package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textHasLeadingWhitespace {

    @Test
    public void [TextNode][Scenario]Test_textHasLeadingWhitespace() {
        String original = "   Hello World!   ";
        TextNode node = TextNode.createFromEncoded(original);
        assertTrue(node.isBlank());
    }

}