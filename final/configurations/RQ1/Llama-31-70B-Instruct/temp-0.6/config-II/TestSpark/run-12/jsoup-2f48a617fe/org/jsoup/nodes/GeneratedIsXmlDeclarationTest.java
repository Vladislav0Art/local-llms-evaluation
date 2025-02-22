package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

import static org.junit.Assert.assertEquals;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertEquals(false, comment.isXmlDeclaration());
    }

}