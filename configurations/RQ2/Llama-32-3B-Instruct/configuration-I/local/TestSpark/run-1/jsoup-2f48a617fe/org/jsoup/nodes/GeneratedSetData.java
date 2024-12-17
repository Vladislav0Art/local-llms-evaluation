package org.jsoup.nodes;

public class GeneratedSetData {

    @Test
    public void setData() {
        String data = "new test";
        Comment comment = new Comment("test");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}