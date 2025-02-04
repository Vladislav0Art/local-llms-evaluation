package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

import org.mockito.Mockito;
import org.jsoup.parser.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_MatchesXMLDeclarationFormat {

    @Test
    public void asXmlDeclaration_MatchesXMLDeclarationFormat() {
        // Given
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><test> </test></root>";
        Comment comment = new Comment(data);

        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        // Then
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.matches("root", true));
    }

}