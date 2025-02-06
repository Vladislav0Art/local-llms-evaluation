package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() throws IOException {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}