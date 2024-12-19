package org.jsoup.nodes;

public class GeneratedGetDataIsCorrect {

    @Test
    public void getDataIsCorrect() {
        Comment comment = new Comment("This is a test comment.");
        assertEquals("This is a test comment.", comment.getData());
    }

}