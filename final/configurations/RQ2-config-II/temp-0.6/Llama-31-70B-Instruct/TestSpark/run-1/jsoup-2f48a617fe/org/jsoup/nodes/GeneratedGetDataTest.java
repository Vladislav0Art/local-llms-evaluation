package org.jsoup.nodes;

public class GeneratedGetDataTest {

    private Comment comment;

    @Test
    public void getDataTest() {
        comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}