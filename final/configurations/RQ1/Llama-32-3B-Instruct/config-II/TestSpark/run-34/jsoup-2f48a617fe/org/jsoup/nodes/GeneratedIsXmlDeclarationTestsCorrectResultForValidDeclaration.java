package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationTestsCorrectResultForValidDeclaration {

    @Test
    public void isXmlDeclarationTestsCorrectResultForValidDeclaration() {
        Comment comment = new Comment("<xml version=\"1.0\"?xml declaration=\"...\">This is a test</xml>");
        assertTrue(comment.isXmlDeclaration());
    }

}