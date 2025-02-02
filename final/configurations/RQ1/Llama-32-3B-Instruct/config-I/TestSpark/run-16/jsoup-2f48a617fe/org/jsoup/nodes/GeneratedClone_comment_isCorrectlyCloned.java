package org.jsoup.nodes;

public class GeneratedClone_comment_isCorrectlyCloned {

    @Test
    public void clone_comment_isCorrectlyCloned() {
        // given
        String data = "This is a valid comment";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();

        // then
        assertEquals(data, clonedComment.getData());
        assertEquals("#comment", clonedComment.nodeName());
    }

}