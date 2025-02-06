package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<data>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("<data>", xmlDeclaration.getData());
    }

}