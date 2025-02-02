package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadForTextNodeWithLeadingTrailingWhitespaceAddsProperIndent {

    @Test
    public void outerHtmlHeadForTextNodeWithLeadingTrailingWhitespaceAddsProperIndent() {
        String leadingTrailingText = "   Hello World   ";
        TextNode textNode = new TextNode(leadingTrailingText);
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