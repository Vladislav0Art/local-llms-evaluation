package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedAsXmlDeclarationGetNull {

    @Test
    public void asXmlDeclarationGetNull() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("This is a comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}