package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclarationTestsCorrectResultForInvalidDeclaration {

    @Test
    public void isXmlDeclarationTestsCorrectResultForInvalidDeclaration() {
        Comment comment = new Comment("This is a test");
        assertFalse(comment.isXmlDeclaration());
    }

}