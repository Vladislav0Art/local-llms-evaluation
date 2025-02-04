package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void AsXmlDeclarationTest() {
        Comment comment = new Comment("<!-- test -->");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}