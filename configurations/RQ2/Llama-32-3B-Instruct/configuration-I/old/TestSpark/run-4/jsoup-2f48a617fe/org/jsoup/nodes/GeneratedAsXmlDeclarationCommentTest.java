package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedAsXmlDeclarationCommentTest {

    @Test
    public void asXmlDeclarationCommentTest() {
        Comment comment = new Comment("<!DOCTYPE html>");
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals(comment.getData(), xmlDeclaration.toString());
    }

}