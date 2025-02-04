package org.jsoup.nodes;

public class GeneratedSetDataSet ReturnsCommentWithNewData {

    @Test
    public void setDataSet

    ReturnsCommentWithNewData() {
        // given
        String data = "new comment";
        Comment comment = new Comment("old comment");

        // when
        comment.setData(data);

        // then
        assertEquals(data, comment.getData());
    }

}