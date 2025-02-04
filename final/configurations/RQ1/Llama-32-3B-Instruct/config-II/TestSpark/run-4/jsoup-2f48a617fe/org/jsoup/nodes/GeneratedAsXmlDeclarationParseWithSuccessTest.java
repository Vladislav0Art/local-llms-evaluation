package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAsXmlDeclarationParseWithSuccessTest {

    @Test
    public void asXmlDeclarationParseWithSuccessTest() throws Exception {
        String data = "<!xml version=\"1.0\" ?><tag>content</tag>";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals("tag", xmlDecl.tagName());
    }

}