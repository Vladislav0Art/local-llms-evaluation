package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_splitTextAtZeroOffset {

    @Test
    public void [TextNode][Scenario]Test_splitTextAtZeroOffset() {
        String original = "Hello World!";
        TextNode node = TextNode.createFromEncoded(original);
        TextNode result = node.splitText(0);
        assertNotNull(result);
    }

}