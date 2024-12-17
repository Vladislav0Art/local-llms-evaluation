package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentIsXmlDeclaration {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

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

}