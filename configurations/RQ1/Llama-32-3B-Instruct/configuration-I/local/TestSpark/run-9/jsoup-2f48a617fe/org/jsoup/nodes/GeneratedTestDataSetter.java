package org.jsoup.nodes;

public class GeneratedTestDataSetter {

    @Test
    public void testDataSetter() {
        Comment comment = new Comment("Hello World!");
        Comment newComment = comment.setData("New Data");
        assertNotNull(newComment);
        assertEquals("New Data", newComment.getData());
        assertEquals("#comment", newComment.nodeName());
    }

}