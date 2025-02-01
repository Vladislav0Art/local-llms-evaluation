package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest_IsXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_IsXmlDeclaration() {
        Comment comment = new Comment("!DOCTYPE html");
        assertNotNull(comment.asXmlDeclaration());
        assertTrue(comment.asXmlDeclaration().isXmlDeclaration());
    }

}