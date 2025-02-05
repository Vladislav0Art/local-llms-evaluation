package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIsXmlDeclarationTest_whenItIsComment_thenFALSE {

    @Test
    public void isXmlDeclarationTest_whenItIsComment_thenFALSE() {
        Comment comment = new Comment("testComment");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        assertEquals(false, isXmlDeclaration);
    }

}