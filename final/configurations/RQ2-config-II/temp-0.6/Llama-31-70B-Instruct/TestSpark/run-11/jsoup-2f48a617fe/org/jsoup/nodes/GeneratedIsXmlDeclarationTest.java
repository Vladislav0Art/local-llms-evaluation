package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        assertTrue(isXmlDeclaration);
    }

}