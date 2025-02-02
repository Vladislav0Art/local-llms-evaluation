package org.jsoup.nodes;

public class GeneratedCommentDataSetTest {

    @Test
    public void commentDataSetTest() {
        Comment comment = new Comment("Hello World!");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}