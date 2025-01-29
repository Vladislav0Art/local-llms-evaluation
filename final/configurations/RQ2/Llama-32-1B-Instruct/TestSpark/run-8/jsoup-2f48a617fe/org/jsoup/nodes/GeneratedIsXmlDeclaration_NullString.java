package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedIsXmlDeclaration_NullString {

    @Test
    public void isXmlDeclaration_NullString() {
        Comment comment = new Comment(null);
        assertFalse(comment.isXmlDeclaration());
    }

}