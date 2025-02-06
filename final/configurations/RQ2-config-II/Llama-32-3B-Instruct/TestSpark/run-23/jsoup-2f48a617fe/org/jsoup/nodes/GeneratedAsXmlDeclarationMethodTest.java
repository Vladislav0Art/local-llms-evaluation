package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAsXmlDeclarationMethodTest {

    @Test
    public void asXmlDeclarationMethodTest() throws IOException {
        Comment comment = new Comment("test");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals(comment.getData(), xmlDecl.getData());
        assertEquals(comment.nodeName(), xmlDecl.getTagName());
    }

}