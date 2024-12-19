package org.jsoup.nodes;

public class GeneratedTestComment setData {

    @Test
    public void testComment

    setData() {
        String data = "#comment";
        Comment comment = new Comment(data);
        comment.setData("newData");
        assertEquals(data, comment.getData());
    }

}