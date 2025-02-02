package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_AppendingOuterHtmlToTheAppendableWorksCorrectly {

    @Test
    public void OuterHtmlTail_AppendingOuterHtmlToTheAppendableWorksCorrectly() {
        Appendable appendable = new StringBuilder();
        Comment comment = new Comment("");
        comment.outerHtmlTail(appendable, 0, null);
        assertTrue(appendable.toString().isEmpty());
    }

}