package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsTrueWhenDataStartsWithXmlDeclarationChar {

    @Test
    public void isXmlDeclarationReturnsTrueWhenDataStartsWithXmlDeclarationChar() {
        String data = "!DOCTYPE html";
        assertTrue(Comment.isXmlDeclaration(data));
    }

}