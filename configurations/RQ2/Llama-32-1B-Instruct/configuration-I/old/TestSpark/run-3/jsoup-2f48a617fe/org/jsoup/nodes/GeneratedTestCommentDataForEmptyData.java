package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentDataForEmptyData {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

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

}