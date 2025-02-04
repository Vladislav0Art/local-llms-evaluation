package org.jsoup.nodes;

public class GeneratedSet_data_ShouldSetCorrectCommentContent {

    @Test
    public void set_data_ShouldSetCorrectCommentContent() {
        // given
        String data = "some comment";
        Comment comment = new Comment(data);

        // when
        comment.setData("new comment");
        String content = comment.getData();

        // then
        assertEquals("new comment", content);
    }

}