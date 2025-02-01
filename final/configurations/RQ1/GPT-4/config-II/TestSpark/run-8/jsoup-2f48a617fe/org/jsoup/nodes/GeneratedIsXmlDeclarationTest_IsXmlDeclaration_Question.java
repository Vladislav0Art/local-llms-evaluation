package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest_IsXmlDeclaration_Question {

    @Test
    public void isXmlDeclarationTest_IsXmlDeclaration_Question() {
        Comment comment = new Comment("?html data");
        assertTrue(comment.isXmlDeclaration());
    }

}