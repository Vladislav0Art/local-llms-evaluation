package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewNodeWithoutDataIsComment {

    @Mock
    Document doc;

    @Test
    public void newNodeWithoutDataIsComment() {
        // given
        TextNode textNode = new TextNode();
        when(doc.createTextNode(anyString())).thenReturn(textNode);

        // when
        Comment comment = new Comment("");

        // then
        assertNotNull(comment);
        assertTrue(comment.getData().isEmpty());
    }

}