package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsCorrectDeclNodeTest {

    @Test
    public void asXmlDeclarationReturnsCorrectDeclNodeTest() throws IOException {
        Comment comment = new Comment("<!DOCTYPE html>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}