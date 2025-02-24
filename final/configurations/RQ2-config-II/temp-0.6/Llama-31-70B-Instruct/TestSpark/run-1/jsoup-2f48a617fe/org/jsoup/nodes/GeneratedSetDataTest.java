package org.jsoup.nodes;

public class GeneratedSetDataTest {

    private Comment comment;

    @Test
    public void setDataTest() {
        comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}