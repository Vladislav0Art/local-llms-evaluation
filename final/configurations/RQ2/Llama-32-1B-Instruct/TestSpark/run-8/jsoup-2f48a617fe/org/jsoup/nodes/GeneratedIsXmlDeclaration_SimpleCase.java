package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedIsXmlDeclaration_SimpleCase {

    @Test
    public void isXmlDeclaration_SimpleCase() {
        Comment comment = new Comment("This is a simple comment");
        assertTrue(comment.isXmlDeclaration());
    }

}