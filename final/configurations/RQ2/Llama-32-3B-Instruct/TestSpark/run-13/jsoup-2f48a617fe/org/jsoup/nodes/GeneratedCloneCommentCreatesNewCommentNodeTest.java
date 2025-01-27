package org.jsoup.nodes;

public class GeneratedCloneCommentCreatesNewCommentNodeTest {

    @Test
    public void cloneCommentCreatesNewCommentNodeTest() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
    }

}