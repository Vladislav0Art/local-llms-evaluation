package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedAsXmlDeclarationGetMatch {

    @Test
    public void asXmlDeclarationGetMatch() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("<<?xml version=\"1.0\" encoding=\"UTF-8\"?><!DOCTYPE root SYSTEM \"root.dtd\"?>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals(comment.getData(), decl.getDecl());
    }

}