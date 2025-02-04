package org.jsoup.nodes;

public class GeneratedGet_data_ShouldReturnCorrectCommentContent {

    @Test
    public void get_data_ShouldReturnCorrectCommentContent() {
        // given
        String data = "some comment";
        Comment comment = new Comment(data);

        // when
        String content = comment.getData();

        // then
        assertEquals(content, data);
    }

}