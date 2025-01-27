package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void commentDataConstructorTest() {
        // Arrange
        String data = "some data";

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertEquals(data, comment.getData());
    }

    @Test
    public void commentNodeNameMethodTest() {
        // Arrange
        Comment comment = new Comment("some data");

        // Act
        String nodeName = comment.nodeName();

        // Assert
        assertEquals(null, nodeName);
    }

    @Test
    public void commentDataSetMethodTest() {
        // Arrange
        Comment comment = new Comment("some data");
        String newData = "new data";

        // Act
        comment.setData(newData);

        // Assert
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadMethodTest() throws IOException {
        // Arrange
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        // Act
        new Comment("some data").outerHtmlHead(accum, depth, out);

        // Assert
        verify(accum).append("<!-- some data -->");
    }

    @Test
    public void outerHtmlTailMethodTest() {
        // Arrange
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        // Act
        new Comment("some data").outerHtmlTail(accum, depth, out);

        // Assert
        verify(accum).append("<!-- some data -->");
    }

    @Test
    public void toStringMethodTest() {
        // Arrange
        Comment comment = new Comment("some data");

        // Act
        String toString = comment.toString();

        // Assert
        assertEquals("<!-- some data -->", toString);
    }

    @Test
    public void cloneMethodTest() throws CloneNotSupportedException {
        // Arrange
        Comment comment = new Comment("some data");

        // Act
        Comment clonedComment = comment.clone();

        // Assert
        assertNotNull(clonedComment);
    }

    @Test
    public void isXmlDeclarationMethodTest() {
        // Arrange

        // Act
        boolean isDeclaration = new Comment("some data").isXmlDeclaration();

        // Assert
        assertTrue(isDeclaration);
    }

    @Test
    public void asXmlDeclarationMethodTest() {
        // Arrange

        // Act
        XmlDeclaration xmlDeclaration = new Comment("some data").asXmlDeclaration();

        // Assert
        assertNotNull(xmlDeclaration);
    }

}