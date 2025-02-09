package org.jsoup.nodes;

public class GeneratedCloneShouldReturnNewCommentInstance {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void cloneShouldReturnNewCommentInstance() {
        Comment original = new Comment(COMMENT_DATA);
        Comment cloned = original.clone();
        assertNotNull(cloned);
        assertNotSame(original, cloned);
    }

}