package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentIsXmlDeclarationForEmptyData {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

    @Test
    public void testCommentIsXmlDeclarationForEmptyData() {
        // Arrange
        when(output.toString()).thenReturn("");

        // Act and Assert
        boolean isXmlDeclaration = comment.execute("isXmlDeclaration", "");
        assertEquals(false, isXmlDeclaration);

        verify(output).toString();
    }

}