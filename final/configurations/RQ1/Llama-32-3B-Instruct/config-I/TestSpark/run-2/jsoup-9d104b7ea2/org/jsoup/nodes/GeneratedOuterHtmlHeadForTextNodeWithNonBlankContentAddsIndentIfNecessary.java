package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadForTextNodeWithNonBlankContentAddsIndentIfNecessary {

    @Test
    public void outerHtmlHeadForTextNodeWithNonBlankContentAddsIndentIfNecessary() {
        String nonBlankText = "Hello World";
        TextNode textNode = new TextNode(nonBlankText);
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        try {
            textNode.outerHtmlHead(accum, depth, out);
        } catch (IOException e) {
        }
        assertTrue(accum.toString().contains("\n"));
    }

}