package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest_NotXmlDeclaration {

    @Test
    public void isXmlDeclarationTest_NotXmlDeclaration() {
        Comment comment = new Comment("test data");
        assertFalse(comment.isXmlDeclaration());
    }

}