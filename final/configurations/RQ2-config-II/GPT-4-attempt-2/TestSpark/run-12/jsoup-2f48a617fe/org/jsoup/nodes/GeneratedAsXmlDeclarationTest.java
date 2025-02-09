package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>");
        assertNotNull(comment.asXmlDeclaration());
        comment.setData("data");
        assertNull(comment.asXmlDeclaration());
    }

}