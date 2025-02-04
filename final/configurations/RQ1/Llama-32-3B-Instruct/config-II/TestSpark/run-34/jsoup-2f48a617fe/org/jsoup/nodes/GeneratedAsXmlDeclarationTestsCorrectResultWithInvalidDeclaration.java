package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationTestsCorrectResultWithInvalidDeclaration {

    @Test
    public void asXmlDeclarationTestsCorrectResultWithInvalidDeclaration() throws IOException {
        Comment comment = new Comment("This is a test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}