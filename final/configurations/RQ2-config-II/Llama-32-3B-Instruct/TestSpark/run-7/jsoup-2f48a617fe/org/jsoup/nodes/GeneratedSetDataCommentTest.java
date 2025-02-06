package org.jsoup.nodes;

public class GeneratedSetDataCommentTest {

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("");
        String data = "newData";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}