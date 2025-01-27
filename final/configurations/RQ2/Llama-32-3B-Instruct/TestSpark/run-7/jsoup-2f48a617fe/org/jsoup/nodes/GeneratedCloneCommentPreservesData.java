package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneCommentPreservesData {

    @Mock
    Document doc;

    @Test
    public void cloneCommentPreservesData() {
        // given
        TextNode textNode1 = new TextNode("some comment");
        when(doc.createTextNode(anyString())).thenReturn(textNode1);
        Comment comment = new Comment(textNode1.getText());

        // when
        TextNode textNode2 = new TextNode();
        when(doc.createTextNode(anyString())).thenReturn(textNode2);
        Comment clonedComment = comment.clone();

        // then
        assertNotNull(clonedComment);
        assertEquals("some comment", clonedComment.getData());
    }

}