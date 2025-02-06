package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedIsXmlDeclarationReturnsCorrectResultTest {

    @Test
    public void isXmlDeclarationReturnsCorrectResultTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}