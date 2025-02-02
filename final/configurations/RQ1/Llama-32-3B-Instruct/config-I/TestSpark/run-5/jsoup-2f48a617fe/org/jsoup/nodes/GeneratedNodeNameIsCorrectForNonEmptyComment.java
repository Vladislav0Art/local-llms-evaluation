package org.jsoup.nodes;

public class GeneratedNodeNameIsCorrectForNonEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void nodeNameIsCorrectForNonEmptyComment() {
        Comment comment = new Comment("This is a comment.");
        Assert.assertEquals(comment.nodeName(), "#comment");
    }

}