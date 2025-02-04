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

public class GeneratedAsXmlDeclaration_DoesNotMatchXMLDeclarationFormat {

    @Test
    public void asXmlDeclaration_DoesNotMatchXMLDeclarationFormat() {
        // Given
        String data = "This is a comment";
        Comment comment = new Comment(data);

        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();

        // Then
        assertNull(xmlDeclaration);
    }

}