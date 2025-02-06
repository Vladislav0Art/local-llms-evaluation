package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataXmlDeclarationIsXmlDeclarationTest {

    private final Document doc = new Document();

    @Test
    public void dataXmlDeclarationIsXmlDeclarationTest() throws IOException {
        String xmlDeclaration = "<?xml version=\"1.0\"?><!DOCTYPE html>";
        Comment comment = new Comment(xmlDeclaration);
        assertTrue(comment.isXmlDeclaration());
    }

}