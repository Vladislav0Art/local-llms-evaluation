package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest_NotXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_NotXmlDeclaration() {
        Comment comment = new Comment("test data");
        assertNull(comment.asXmlDeclaration());
    }

}