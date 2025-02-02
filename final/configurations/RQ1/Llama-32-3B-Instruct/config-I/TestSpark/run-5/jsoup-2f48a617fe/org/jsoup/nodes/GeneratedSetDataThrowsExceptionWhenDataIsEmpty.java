package org.jsoup.nodes;

public class GeneratedSetDataThrowsExceptionWhenDataIsEmpty {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void setDataThrowsExceptionWhenDataIsEmpty() {
        Comment comment = new Comment(EMPTY_COMMENT);
        comment.setData("");
    }

}