package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedIsNotXmlDeclarationTest {

    @Test
    public void isNotXmlDeclarationTest() {
        Comment comment = new Comment("Test Comment");
        assertFalse(comment.isXmlDeclaration());
    }

}