package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedIsXmlDeclarationCommentTest {

    @Test
    public void isXmlDeclarationCommentTest() {
        Comment comment = new Comment("<!DOCTYPE html>");
        assertTrue(comment.isXmlDeclaration());
    }

}