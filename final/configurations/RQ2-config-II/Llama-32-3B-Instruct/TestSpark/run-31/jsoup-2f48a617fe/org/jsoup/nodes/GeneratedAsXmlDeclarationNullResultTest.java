package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationNullResultTest {

    private final Document doc = new Document();

    @Test
    public void asXmlDeclarationNullResultTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}