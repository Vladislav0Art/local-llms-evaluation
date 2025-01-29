package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_isBlank {

    @Test
    public void [TextNode][Scenario]Test_isBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertEquals(false, node.isBlank());
    }

}