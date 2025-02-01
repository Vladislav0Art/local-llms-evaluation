package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest_firstSymbolIsQuestion {

    @Test
    public void isXmlDeclarationTest_firstSymbolIsQuestion() {
        Comment comment = new Comment("?Test comment");
        assertTrue(comment.isXmlDeclaration());
    }

}