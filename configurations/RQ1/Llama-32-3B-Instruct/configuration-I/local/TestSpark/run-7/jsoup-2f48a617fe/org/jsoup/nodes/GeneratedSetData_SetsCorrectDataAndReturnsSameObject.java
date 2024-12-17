package org.jsoup.nodes;

public class GeneratedSetData_SetsCorrectDataAndReturnsSameObject {

    @Test
    public void setData_SetsCorrectDataAndReturnsSameObject() {
        Comment comment = new Comment("");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
        assertSame(comment, comment.setData(null));
    }

}