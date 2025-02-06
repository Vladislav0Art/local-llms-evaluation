package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataEmptyStringIsXmlDeclarationTest {

    private final Document doc = new Document();

    @Test
    public void dataEmptyStringIsXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}