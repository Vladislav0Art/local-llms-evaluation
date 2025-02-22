package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

import static org.junit.Assert.assertEquals;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertEquals(null, comment.asXmlDeclaration());
    }

}