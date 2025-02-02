package org.jsoup.nodes;

public class GeneratedToStringIsCorrectForEmptyComment {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void toStringIsCorrectForEmptyComment() {
        Assert.assertTrue(new Comment(EMPTY_COMMENT).toString().equals("<!-- -->"));
    }

}