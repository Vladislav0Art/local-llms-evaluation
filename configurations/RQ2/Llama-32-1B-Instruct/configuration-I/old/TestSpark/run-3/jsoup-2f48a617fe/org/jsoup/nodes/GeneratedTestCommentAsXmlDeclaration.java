package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentAsXmlDeclaration {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

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

}