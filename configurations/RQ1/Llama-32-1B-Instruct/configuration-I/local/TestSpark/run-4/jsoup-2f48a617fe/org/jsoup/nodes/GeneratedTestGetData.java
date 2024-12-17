package org.jsoup.nodes;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        String data = "This is a sample comment.";
        Comment comment = new Comment(data);
        assertEquals("This is a sample comment.", comment.getData());
    }

}