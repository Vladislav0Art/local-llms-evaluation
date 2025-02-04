package org.jsoup.nodes;

public class GeneratedCreateCommentWithCorrectData_ReturnsComment {

    @Test
    public void createCommentWithCorrectData_ReturnsComment() {
        // given
        String data = "This is a comment";

        // when
        Comment comment = new Comment(data);

        // then
        assertEquals(data, comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

}