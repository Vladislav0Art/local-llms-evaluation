package org.jsoup.nodes;

public class GeneratedNodeNameIsCorrectForEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void nodeNameIsCorrectForEmptyComment() {
        Comment comment = new Comment(EMPTY_COMMENT);
        Assert.assertEquals(comment.nodeName(), "#comment");
    }

}