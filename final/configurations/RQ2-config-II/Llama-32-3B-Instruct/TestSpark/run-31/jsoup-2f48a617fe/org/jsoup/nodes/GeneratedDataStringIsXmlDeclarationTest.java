package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataStringIsXmlDeclarationTest {

    private final Document doc = new Document();

    @Test
    public void dataStringIsXmlDeclarationTest() throws IOException {
        String xmlDeclaration = "<xmlData>Hello</xmlData>";
        Comment comment = new Comment(xmlDeclaration);
        assertTrue(comment.isXmlDeclaration());
    }

}