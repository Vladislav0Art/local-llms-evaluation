package org.jsoup.nodes;

public class GeneratedGetDataShouldBeStringValue {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void getDataShouldBeStringValue() {
        Comment comment = new Comment(COMMENT_DATA);
        assertNotNull(comment.getData());
        assertTrue(comment.getData().equals(COMMENT_DATA));
    }

}