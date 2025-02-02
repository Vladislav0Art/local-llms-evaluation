package org.jsoup.nodes;

public class GeneratedToStringIsCorrectForNonEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void toStringIsCorrectForNonEmptyComment() {
        Assert.assertEquals(new Comment("This is a comment.").toString(), "<!-- This is a comment. -->");
    }

}