package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestCommentNodeName {

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

}