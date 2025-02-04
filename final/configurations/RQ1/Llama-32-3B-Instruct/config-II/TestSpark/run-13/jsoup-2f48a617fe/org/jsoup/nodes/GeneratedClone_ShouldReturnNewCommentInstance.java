package org.jsoup.nodes;

public class GeneratedClone_ShouldReturnNewCommentInstance {

    @Test
    public void clone_ShouldReturnNewCommentInstance() {
        // given
        String data = "some comment";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();

        // then
        assertNotNull(clonedComment);
    }

}