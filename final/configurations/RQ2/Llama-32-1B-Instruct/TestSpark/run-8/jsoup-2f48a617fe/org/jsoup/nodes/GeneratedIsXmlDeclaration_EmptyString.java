package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedIsXmlDeclaration_EmptyString {

    @Test
    public void isXmlDeclaration_EmptyString() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}