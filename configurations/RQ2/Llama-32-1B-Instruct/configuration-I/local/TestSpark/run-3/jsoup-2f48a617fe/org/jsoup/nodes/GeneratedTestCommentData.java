package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentData {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

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

}