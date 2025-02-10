package org.jsoup.nodes;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals("This is a comment", comment.getData());
    }

}