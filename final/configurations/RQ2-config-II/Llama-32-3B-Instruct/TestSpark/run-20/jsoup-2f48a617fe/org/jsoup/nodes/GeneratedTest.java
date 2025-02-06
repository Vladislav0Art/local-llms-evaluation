package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedTest {

    @Test
    public void constructor_withData_makesComment() {
        // Arrange & Act
        String data = "data";
        Comment comment = new Comment(data);
        // Assert
        assertThat(comment.getData(), is(data));
    }

    @Test
    public void nodeName_returnsNodeName() {
        // Arrange & Act
        Comment comment = new Comment("data");
        String nodeName = comment.nodeName();
        // Assert
        assertThat(nodeName, is("COMMENT"));
    }

    @Test
    public void getData_returnsData() {
        // Arrange & Act
        Comment comment = new Comment("data");
        String data = comment.getData();
        // Assert
        assertThat(data, is("data"));
    }

    @Test
    public void setData_setsData() {
        // Arrange & Act
        Comment comment = new Comment("");
        comment.setData("newData");
        String data = comment.getData();
        // Assert
        assertThat(data, is("newData"));
    }

    @Test
    public void outerHtmlHead_makesOuterHtmlHead() throws IOException {
        // Arrange
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        // Act & Assert
        when(out.toString()).thenReturn("");
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(anyString());
    }

    @Test
    public void outerHtmlTail_makesOuterHtmlTail() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        // Act & Assert
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append(anyString());
    }

    @Test
    public void toString_returnsComment() {
        // Arrange & Act
        Comment comment = new Comment("data");
        String toString = comment.toString();
        // Assert
        assertThat(toString, is("<!-- data -->"));
    }

    @Test
    public void clone_returnsCommentClone() {
        // Arrange
        Comment comment = new Comment("");
        Comment clone = comment.clone();
        // Assert
        assertThat(clone.getData(), is(""));
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        // Arrange & Act
        Comment comment = new Comment("");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        // Assert
        assertThat(isXmlDeclaration, is(false));
    }

    @Test
    public void asXmlDeclaration_returnsNull() {
        // Arrange & Act
        Comment comment = new Comment("data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        // Assert
        assertThat(xmlDeclaration, is(null));
    }

}