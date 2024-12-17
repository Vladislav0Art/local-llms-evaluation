package org.jsoup.nodes;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("Test comment");
        comment.setData("New data");
        assertEquals("Test comment", comment.getData());
    }

}