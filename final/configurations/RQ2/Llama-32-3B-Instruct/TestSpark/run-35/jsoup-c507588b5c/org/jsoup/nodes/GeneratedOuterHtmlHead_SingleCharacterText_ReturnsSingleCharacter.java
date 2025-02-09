package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_SingleCharacterText_ReturnsSingleCharacter {

    @Test
    public void outerHtmlHead_SingleCharacterText_ReturnsSingleCharacter() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        TextNode node = new TextNode("a");

        // When:
        node.outerHtmlHead(accum, depth, out);

        // Then:
        assertEquals("a", accum.toString());
    }

}