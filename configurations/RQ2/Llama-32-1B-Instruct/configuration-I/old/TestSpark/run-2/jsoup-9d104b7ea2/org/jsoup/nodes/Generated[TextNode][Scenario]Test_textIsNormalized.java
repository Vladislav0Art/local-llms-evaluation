package org.jsoup.nodes;

public class Generated[TextNode][Scenario]

Test_textIsNormalized {

    @Test
    public void [TextNode][Scenario]Test_textIsNormalized() {
        String original = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(original);
        assertEquals("&lt;Hello&gt;", node.text(original));
    }

}