package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalseWhenDataStartsWithNewline {

    @Test
    public void isXmlDeclarationReturnsFalseWhenDataStartsWithNewline() {
        String data = "\n!";
        assertTrue(Comment.isXmlDeclaration(data));
    }

}