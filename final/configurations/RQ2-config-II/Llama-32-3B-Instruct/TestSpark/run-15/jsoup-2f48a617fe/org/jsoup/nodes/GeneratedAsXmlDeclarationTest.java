package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertNotNull(comment.asXmlDeclaration());
        assertEquals("", comment.asXmlDeclaration().getData());
    }

}