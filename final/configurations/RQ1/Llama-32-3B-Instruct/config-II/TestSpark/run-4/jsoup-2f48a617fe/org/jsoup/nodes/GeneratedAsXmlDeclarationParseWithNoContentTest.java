package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAsXmlDeclarationParseWithNoContentTest {

    @Test
    public void asXmlDeclarationParseWithNoContentTest() throws Exception {
        String data = "<!xml version=\"1.0\" ?><";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNull(xmlDecl);
    }

}