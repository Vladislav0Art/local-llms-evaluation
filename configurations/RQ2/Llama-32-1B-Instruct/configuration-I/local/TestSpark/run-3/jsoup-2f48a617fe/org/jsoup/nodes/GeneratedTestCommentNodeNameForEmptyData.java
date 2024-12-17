package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentNodeNameForEmptyData {

    @Mock
    private Appendable output;

    public CommentSpy comment = new CommentSpy();

    @Test
    public void testCommentNodeNameForEmptyData() {
        // Arrange
        when(output.toString()).thenReturn("");

        // Act and Assert
        String nodeName = comment.execute("Comment", "");
        assertEquals("", nodeName);

        verify(output).toString();
    }

}