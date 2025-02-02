package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsTrueIfDataStartsWithXmlDeclarationChar {

    @Test
    public void isXmlDeclarationReturnsTrueIfDataStartsWithXmlDeclarationChar() {
        String data = "!DOCTYPE html";
        assertTrue(Comment.isXmlDeclaration(data));
    }

}