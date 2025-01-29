package org.jsoup.nodes;

public class GeneratedTestCommentSetData {

    @Test
    public void testCommentSetData() {
        // Arrange
        String data = "Example comment";
        Document document = new Document();
        Appendable accum = document.getAppendable();

        // Act
        comment = new Comment("");
        comment.setDATA(data);
        assertNotSame(accum, document.getAppendable());

        // Assert
        assertEquals(data, comment.getData());
    }

}