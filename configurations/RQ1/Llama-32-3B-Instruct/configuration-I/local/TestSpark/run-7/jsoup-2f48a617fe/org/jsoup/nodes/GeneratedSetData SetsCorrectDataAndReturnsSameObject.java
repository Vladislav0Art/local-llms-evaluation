package org.jsoup.nodes;

public class GeneratedSetData SetsCorrectDataAndReturnsSameObject {

    @Test
    public void setData

    SetsCorrectDataAndReturnsSameObject() {
        Comment comment = new Comment("");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
        assertSame(comment, comment.setData(null));
    }

}