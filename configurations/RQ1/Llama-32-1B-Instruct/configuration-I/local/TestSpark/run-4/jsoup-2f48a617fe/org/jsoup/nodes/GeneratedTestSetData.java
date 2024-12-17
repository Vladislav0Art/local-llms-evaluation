package org.jsoup.nodes;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("#comment");
        comment.setData("New comment content.");
        assertEquals("New comment content.", comment.getData());
    }

}