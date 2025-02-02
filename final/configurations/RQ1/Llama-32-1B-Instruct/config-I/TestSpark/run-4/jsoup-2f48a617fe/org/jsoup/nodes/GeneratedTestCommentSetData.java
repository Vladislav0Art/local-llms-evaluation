package org.jsoup.nodes;

public class GeneratedTestCommentSetData {

    @Test
    public void testCommentSetData() {
        String data = "Some data";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}