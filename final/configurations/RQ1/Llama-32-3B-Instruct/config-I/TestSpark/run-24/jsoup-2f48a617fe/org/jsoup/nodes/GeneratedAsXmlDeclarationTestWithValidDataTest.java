package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationTestWithValidDataTest {

    private static final String DATA = "This is a comment";

    @Test
    public void asXmlDeclarationTestWithValidDataTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.create().prettyPrint(true);
        Comment comment = new Comment(DATA);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}