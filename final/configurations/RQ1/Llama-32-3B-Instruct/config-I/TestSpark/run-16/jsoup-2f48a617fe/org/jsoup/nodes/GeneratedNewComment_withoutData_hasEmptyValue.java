package org.jsoup.nodes;

public class GeneratedNewComment_withoutData_hasEmptyValue {

    @Test
    public void newComment_withoutData_hasEmptyValue() {
        // given
        Comment comment = new Comment("");

        // then
        assertEquals("", comment.getData());
    }

}