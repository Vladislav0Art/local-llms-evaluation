package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_cloneIsSameAsOriginal {

    @Test
    public void [TextNode][Scenario]Test_cloneIsSameAsOriginal() {
        String original = "Hello World!";
        TextNode node1 = TextNode.createFromEncoded(original);
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}