package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

    @Test
    public void nodeNameTest() {
        // Arrange
        comment = new Comment("data");

        // Act
        String nodeName = comment.nodeName();

        // Assert
        assertEquals("#comment", nodeName);
    }

    @Test
    public void getDataTest() {
        // Arrange
        comment = new Comment("data");

        // Act
        String data = comment.getData();

        // Assert
        assertEquals("data", data);
    }

    @Test
    public void setDataTest() {
        // Arrange
        comment = new Comment("data");
        String newData = "newData";

        // Act
        comment.setData(newData);

        // Assert
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        // Arrange
        comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        comment.outerHtmlHead(accum, 0, out);

        // Assert
        assertEquals("<!--data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        // Arrange
        comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        comment.outerHtmlTail(accum, 0, out);

        // Assert
        assertEquals("", accum.toString());
    }

}