package org.jsoup.nodes;

public class GeneratedSetDataUpdatesTheDataCorrectly {

    @Test
    public void setDataUpdatesTheDataCorrectly() {
        Comment comment = new Comment("Initial Data");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}