package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_EmptyTextNode_ReturnsNoOutput {

    @Test
    public void outerHtmlHead_EmptyTextNode_ReturnsNoOutput() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // When:
        node.outerHtmlHead(accum, depth, out);

        // Then:
        assertTrue(accum.isEmpty());
    }

}