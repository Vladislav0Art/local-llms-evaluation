package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHeadNull {

    @Test
    public void testOuterHtmlHeadNull() {
        Document.OutputSettings out = null;
        try {
            Comment comment = new Comment("#comment");
            comment.outerHtmlHead(null, 0, out);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}