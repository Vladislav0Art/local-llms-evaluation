package org.jsoup.nodes;

public class GeneratedGetDataCommentStringReturnsDataValueTest {

    @Test
    public void getDataCommentStringReturnsDataValueTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}