package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsCorrectDeclaration {

    @Test
    public void asXmlDeclarationReturnsCorrectDeclaration() throws IOException {
        XmlDeclaration declaration = new XmlDeclaration();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Appendable accum = out;
        int depth = 0;
        Parser parser = new Parser(ParseSettings.STRICT);
        Document document = parser.parse(declaration.toString(), null, outSettings, 0, 1);
        Comment comment = (Comment) document.head().children().first();
        assertNotNull(comment.asXmlDeclaration());
        assertEquals(declaration, comment.asXmlDeclaration());
    }

}