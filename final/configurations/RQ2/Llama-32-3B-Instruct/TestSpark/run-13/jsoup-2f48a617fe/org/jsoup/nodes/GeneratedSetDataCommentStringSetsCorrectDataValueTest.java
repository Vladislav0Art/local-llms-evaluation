package org.jsoup.nodes;

public class GeneratedSetDataCommentStringSetsCorrectDataValueTest {

    @Test
    public void setDataCommentStringSetsCorrectDataValueTest() {
        Comment comment = new Comment("");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}