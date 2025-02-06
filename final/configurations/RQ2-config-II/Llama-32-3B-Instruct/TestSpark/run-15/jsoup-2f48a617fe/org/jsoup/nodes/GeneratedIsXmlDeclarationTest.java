package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Comment data");
        assertTrue(comment.isXmlDeclaration());
    }

}