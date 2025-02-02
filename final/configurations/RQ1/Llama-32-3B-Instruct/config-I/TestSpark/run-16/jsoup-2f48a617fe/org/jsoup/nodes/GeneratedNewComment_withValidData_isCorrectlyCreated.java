package org.jsoup.nodes;

public class GeneratedNewComment_withValidData_isCorrectlyCreated {

    @Test
    public void newComment_withValidData_isCorrectlyCreated() {
        // given
        String data = "This is a valid comment";
        Comment comment = new Comment(data);

        // then
        assertEquals(data, comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

}