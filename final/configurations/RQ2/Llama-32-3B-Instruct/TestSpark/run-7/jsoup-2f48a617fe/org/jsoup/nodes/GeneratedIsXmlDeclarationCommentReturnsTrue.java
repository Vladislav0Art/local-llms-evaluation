package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationCommentReturnsTrue {

    @Mock
    Document doc;

    @Test
    public void isXmlDeclarationCommentReturnsTrue() {
        // given
        TextNode textNode1 = new TextNode();
        when(doc.createTextNode(anyString())).thenReturn(textNode1);
        Comment comment = new Comment("");

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertTrue(result);
    }

}