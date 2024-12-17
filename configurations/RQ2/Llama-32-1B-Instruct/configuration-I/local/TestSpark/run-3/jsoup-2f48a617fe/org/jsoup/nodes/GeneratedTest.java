package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTest {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

    @Test
    public void testCommentNodeName() {
        // Arrange
        String data = "This is a sample comment.";
        when(output.toString()).thenReturn(data);

        // Act
        String nodeName = comment.execute("Comment", data);
        assertEquals(data, nodeName);

        verify(output).toString();
    }

    @Test
    public void testCommentData() {
        // Arrange
        Comment commentObject = new Comment(data);
        when(commentObject.getData()).thenReturn("sample_data");

        // Act
        String getData = comment.execute("getData", data);
        assertEquals(getData, getData);

        verify(commentObject).getData();

        Comment clone = commentObject.clone();
        assertNotNull(clone);
        assertEquals(getData, clone.getData());
    }

    @Test
    public void testCommentIsXmlDeclaration() {
        // Arrange
        String data = "This is a sample XML Declaration.";
        when(output.toString()).thenReturn(data);

        // Act
        boolean isXmlDeclaration = comment.execute("isXmlDeclaration", data);
        assertEquals(true, isXmlDeclaration);

        verify(output).toString();
    }

    @Test
    public void testCommentAsXmlDeclaration() {
        // Arrange
        Comment commentObject = new Comment(data);
        when(commentObject.asXmlDeclaration()).thenReturn(new XmlDeclaration());

        // Act
        String asXmlDeclaration = comment.execute("asXmlDeclaration", data);
        assertEquals(null, asXmlDeclaration);

        verify(commentObject).asXmlDeclaration();

        XmlDeclaration xmlDeclaration = new XmlDeclaration();
        String actualAsXmlDeclaration = comment.asXmlDeclaration().toString();
        assertEquals(xmlDeclaration, actualAsXmlDeclaration);
    }

    @Test
    public void testCommentNodeNameForEmptyData() {
        // Arrange
        when(output.toString()).thenReturn("");

        // Act and Assert
        String nodeName = comment.execute("Comment", "");
        assertEquals("", nodeName);

        verify(output).toString();
    }

    @Test
    public void testCommentDataForEmptyData() {
        // Arrange
        Comment commentObject = new Comment("");
        when(commentObject.getData()).thenReturn("");

        // Act
        String getData = comment.execute("getData", "");
        assertEquals("", getData);

        verify(commentObject).getData();

        Comment clone = commentObject.clone();
        assertNotNull(clone);
        assertEquals("", clone.getData());
    }

    @Test
    public void testCommentIsXmlDeclarationForEmptyData() {
        // Arrange
        when(output.toString()).thenReturn("");

        // Act and Assert
        boolean isXmlDeclaration = comment.execute("isXmlDeclaration", "");
        assertEquals(false, isXmlDeclaration);

        verify(output).toString();
    }

    @Test
    public void testCommentAsXmlDeclarationForEmptyData() {
        // Arrange
        Comment commentObject = new Comment("");
        when(commentObject.asXmlDeclaration()).thenReturn(null);

        // Act and Assert
        String asXmlDeclaration = comment.execute("asXmlDeclaration", "");
        assertNotNull(asXmlDeclaration);
        assertEquals(null, asXmlDeclaration);

        verify(commentObject).asXmlDeclaration();

        assertNull(asXmlDeclaration);
    }

}