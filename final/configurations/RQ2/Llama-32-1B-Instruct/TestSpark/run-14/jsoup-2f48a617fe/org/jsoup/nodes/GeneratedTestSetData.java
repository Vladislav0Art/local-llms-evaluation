package org.jsoup.nodes;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("This is a sample comment.");
        comment.setData("This is another sample comment.");
        assertEquals("This is a sample comment.", comment.getData());
    }

}