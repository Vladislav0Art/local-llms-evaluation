package org.jsoup.nodes;

public class GeneratedSetDataSetsCorrectData {

    @Test
    public void setDataSetsCorrectData() {
        Comment comment = new Comment("<!-- comment -->");
        comment.setData("<!-- new comment -->");
        assertEquals("<!-- new comment -->", comment.getData());
    }

}