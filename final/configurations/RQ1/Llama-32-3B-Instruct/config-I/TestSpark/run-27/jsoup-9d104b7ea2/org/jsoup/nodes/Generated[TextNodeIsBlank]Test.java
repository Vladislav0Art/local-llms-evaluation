package org.jsoup.nodes;

public class Generated[TextNodeIsBlank]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeIsBlank]Test() {
        String originalText = "\n  \t";
        boolean isBlank = textNode.text().isEmpty();
        assertTrue(isBlank);
    }

}