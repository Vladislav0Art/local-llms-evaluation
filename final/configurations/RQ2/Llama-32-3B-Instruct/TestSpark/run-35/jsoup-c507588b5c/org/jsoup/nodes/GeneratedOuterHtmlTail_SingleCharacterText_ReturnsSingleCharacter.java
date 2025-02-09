package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_SingleCharacterText_ReturnsSingleCharacter {

    @Test
    public void outerHtmlTail_SingleCharacterText_ReturnsSingleCharacter() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        TextNode node = new TextNode("a");

        // When:
        node.outerHtmlTail(accum, depth, out);

        // Then:
        assertEquals("a", accum.toString());
    }

}