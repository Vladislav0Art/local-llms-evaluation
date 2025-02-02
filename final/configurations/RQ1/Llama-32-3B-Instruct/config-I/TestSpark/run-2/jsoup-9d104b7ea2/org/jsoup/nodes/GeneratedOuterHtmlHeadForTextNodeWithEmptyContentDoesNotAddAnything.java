package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadForTextNodeWithEmptyContentDoesNotAddAnything {

    @Test
    public void outerHtmlHeadForTextNodeWithEmptyContentDoesNotAddAnything() {
        String emptyText = "";
        TextNode textNode = new TextNode(emptyText);
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        try {
            textNode.outerHtmlHead(accum, depth, out);
        } catch (IOException e) {
        }
        assertEquals("", accum.toString());
    }

}