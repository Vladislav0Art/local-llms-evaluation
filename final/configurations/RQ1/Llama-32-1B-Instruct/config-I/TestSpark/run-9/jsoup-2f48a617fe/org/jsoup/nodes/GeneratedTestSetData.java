package org.jsoup.nodes;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        String data = "New value for comment";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}