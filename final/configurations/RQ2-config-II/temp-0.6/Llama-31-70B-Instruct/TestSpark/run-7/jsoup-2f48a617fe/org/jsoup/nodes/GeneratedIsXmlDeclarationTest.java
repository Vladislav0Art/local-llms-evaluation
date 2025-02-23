package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        assertEquals(true, comment.isXmlDeclaration());
    }

}