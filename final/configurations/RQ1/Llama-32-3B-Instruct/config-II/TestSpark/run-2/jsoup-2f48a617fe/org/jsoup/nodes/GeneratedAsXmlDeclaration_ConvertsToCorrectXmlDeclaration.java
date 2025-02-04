package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_ConvertsToCorrectXmlDeclaration {

    @Test
    public void asXmlDeclaration_ConvertsToCorrectXmlDeclaration() throws IOException {
        Comment comment = new Comment("!");
        XmlDeclaration decl = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("!DOCTYPE", decl.content());
    }

}