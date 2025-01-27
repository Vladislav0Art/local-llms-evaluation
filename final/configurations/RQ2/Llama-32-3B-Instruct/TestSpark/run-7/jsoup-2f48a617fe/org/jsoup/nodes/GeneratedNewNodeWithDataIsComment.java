package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewNodeWithDataIsComment {

    @Mock
    Document doc;

    @Test
    public void newNodeWithDataIsComment() {
        // given
        TextNode textNode = new TextNode("some comment");
        when(doc.createTextNode(anyString())).thenReturn(textNode);

        // when
        Comment comment = new Comment(textNode.getText());

        // then
        assertNotNull(comment);
        assertEquals("some comment", comment.getData());
    }

}