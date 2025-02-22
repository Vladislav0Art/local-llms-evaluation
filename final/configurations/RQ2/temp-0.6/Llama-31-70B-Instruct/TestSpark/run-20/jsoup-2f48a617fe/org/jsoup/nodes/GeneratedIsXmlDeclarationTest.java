package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test comment");
        assertEquals(false, comment.isXmlDeclaration());
    }

}