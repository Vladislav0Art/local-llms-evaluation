package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_splitTextAtNegativeOffset {

    @Test
    public void [TextNode][Scenario]Test_splitTextAtNegativeOffset() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        assertEquals("Hello World!", node.text(original));
    }

}