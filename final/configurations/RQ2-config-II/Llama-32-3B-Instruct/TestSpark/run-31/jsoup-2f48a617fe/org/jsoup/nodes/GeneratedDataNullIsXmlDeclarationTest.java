package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataNullIsXmlDeclarationTest {

    private final Document doc = new Document();

    @Test
    public void dataNullIsXmlDeclarationTest() {
        Comment comment = new Comment(null);
        assertFalse(comment.isXmlDeclaration());
    }

}