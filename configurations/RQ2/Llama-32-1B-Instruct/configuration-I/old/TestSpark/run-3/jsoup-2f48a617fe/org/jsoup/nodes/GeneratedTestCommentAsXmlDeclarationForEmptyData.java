package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentAsXmlDeclarationForEmptyData {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

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