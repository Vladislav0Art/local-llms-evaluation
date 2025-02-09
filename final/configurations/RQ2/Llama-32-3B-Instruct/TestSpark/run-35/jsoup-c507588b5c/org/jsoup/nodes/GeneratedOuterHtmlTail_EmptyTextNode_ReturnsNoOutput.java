package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_EmptyTextNode_ReturnsNoOutput {

    @Test
    public void outerHtmlTail_EmptyTextNode_ReturnsNoOutput() {
        // Given:
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // When:
        node.outerHtmlTail(accum, depth, out);

        // Then:
        assertTrue(accum.isEmpty());
    }

}