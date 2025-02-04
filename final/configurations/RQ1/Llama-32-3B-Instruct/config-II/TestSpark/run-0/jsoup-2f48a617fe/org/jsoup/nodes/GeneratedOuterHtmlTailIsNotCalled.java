package org.jsoup.nodes;

public class GeneratedOuterHtmlTailIsNotCalled {

    @Test
    public void outerHtmlTailIsNotCalled() {
        Comment comment = new Comment();
        assert (comment.outerHtmlTail(null, 0, null) == null);
    }

}