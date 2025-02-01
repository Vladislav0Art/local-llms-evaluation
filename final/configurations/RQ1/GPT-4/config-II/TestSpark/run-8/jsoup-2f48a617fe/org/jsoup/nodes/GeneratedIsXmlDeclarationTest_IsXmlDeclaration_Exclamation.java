package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest_IsXmlDeclaration_Exclamation {

    @Test
    public void isXmlDeclarationTest_IsXmlDeclaration_Exclamation() {
        Comment comment = new Comment("!html data");
        assertTrue(comment.isXmlDeclaration());
    }

}