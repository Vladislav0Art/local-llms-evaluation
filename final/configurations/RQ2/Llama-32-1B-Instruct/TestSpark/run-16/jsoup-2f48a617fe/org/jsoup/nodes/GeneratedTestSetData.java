package org.jsoup.nodes;

public class GeneratedTestSetData {

    private LeafNode comment;

    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testSetData() {
        String data = "This is a new comment";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}