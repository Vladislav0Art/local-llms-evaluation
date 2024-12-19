package org.jsoup.nodes;

public class GeneratedSetDataChangesDataCorrectly {

    @Test
    public void setDataChangesDataCorrectly() {
        Comment comment = new Comment("This is a test comment.");
        comment.setData("New comment data.");
        assertEquals(comment.getData(), "New comment data.");
    }

}