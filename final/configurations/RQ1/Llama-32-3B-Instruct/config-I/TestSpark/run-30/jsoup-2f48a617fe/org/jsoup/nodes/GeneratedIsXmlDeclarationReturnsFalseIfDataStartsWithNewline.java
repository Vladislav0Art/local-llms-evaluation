package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalseIfDataStartsWithNewline {

    @Test
    public void isXmlDeclarationReturnsFalseIfDataStartsWithNewline() {
        String data = "\n!";
        assertTrue(Comment.isXmlDeclaration(data));
    }

}