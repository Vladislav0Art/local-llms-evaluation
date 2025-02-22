package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("This is a comment");
        assertNull(comment.asXmlDeclaration());

        comment = new Comment("! This is an XML Declaration");
        assertNotNull(comment.asXmlDeclaration());
    }

}