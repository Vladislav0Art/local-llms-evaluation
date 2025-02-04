package org.jsoup.nodes;

public class GeneratedSetData_SetDataAndReturnThis_WhenCalled {

    @Test
    public void setData_SetDataAndReturnThis_WhenCalled() {
        Comment comment = new Comment("Hello World");
        String newData = "New Data";
        Comment result = comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}