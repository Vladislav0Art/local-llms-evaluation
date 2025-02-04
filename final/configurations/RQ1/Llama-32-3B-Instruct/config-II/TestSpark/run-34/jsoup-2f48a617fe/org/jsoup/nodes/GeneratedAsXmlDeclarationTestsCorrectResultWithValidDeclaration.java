package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationTestsCorrectResultWithValidDeclaration {

    @Test
    public void asXmlDeclarationTestsCorrectResultWithValidDeclaration() throws IOException {
        Comment comment = new Comment("<xml version=\"1.0\"?xml declaration=\"...\">This is a test</xml>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}