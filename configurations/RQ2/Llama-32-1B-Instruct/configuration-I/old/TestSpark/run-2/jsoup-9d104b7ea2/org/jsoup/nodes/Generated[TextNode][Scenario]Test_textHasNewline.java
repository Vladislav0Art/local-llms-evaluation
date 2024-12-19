package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textHasNewline {

    @Test
    public void [TextNode][Scenario]Test_textHasNewline() {
        String original = "\nThis is a line of text.\n";
        TextNode node = TextNode.createFromEncoded(original);
        assertEquals("This is a line of text.", node.text(original));
    }

}