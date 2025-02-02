package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAsXmlDeclaration_GivenXmlDeclarationData_ReturnsNull {

    public static class Appendable extends StringBuilder {
    }

    @Test
    public void asXmlDeclaration_GivenXmlDeclarationData_ReturnsNull() throws IOException {
        Appendable appendable = new Appendable();
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);

        String data = "This is an xml declaration";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}