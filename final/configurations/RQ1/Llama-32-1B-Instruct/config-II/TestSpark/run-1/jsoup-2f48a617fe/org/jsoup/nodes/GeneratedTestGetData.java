package org.jsoup.nodes;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        String data = "#comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}