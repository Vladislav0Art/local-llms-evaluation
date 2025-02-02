package org.jsoup.nodes;

public class GeneratedClone_comment_isDifferentFromOriginal {

    @Test
    public void clone_comment_isDifferentFromOriginal() {
        // given
        String data = "This is a valid comment";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();

        // then
        assertNotSame(comment, clonedComment);
        assertEquals(data, clonedComment.getData());
        assertEquals("#comment", clonedComment.nodeName());
    }

}