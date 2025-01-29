package org.jsoup.nodes;

public class GeneratedTestCommentGetData {

    @Test
    public void testCommentGetData() {
        // Arrange
        Document document = new Document();
        Appendable accum = document.getAppendable();

        // Act
        comment = new Comment("");
        comment.setData("");

        // Assert
        assertEquals(data, comment.getData());
    }

}