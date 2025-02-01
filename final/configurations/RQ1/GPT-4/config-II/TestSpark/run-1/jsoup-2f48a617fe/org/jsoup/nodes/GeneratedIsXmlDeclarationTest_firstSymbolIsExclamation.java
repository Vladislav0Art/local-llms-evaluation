package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest_firstSymbolIsExclamation {

    @Test
    public void isXmlDeclarationTest_firstSymbolIsExclamation() {
        Comment comment = new Comment("!Test comment");
        assertTrue(comment.isXmlDeclaration());
    }

}