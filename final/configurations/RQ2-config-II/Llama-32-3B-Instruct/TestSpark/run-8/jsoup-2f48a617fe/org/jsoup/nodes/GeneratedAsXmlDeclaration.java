package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclaration {

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals("", xmlDecl.getValue());
    }

}