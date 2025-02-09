package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAsXmlDeclaration_GivenEmptyData_ReturnsCorrectDeclaration {

    @Test
    public void asXmlDeclaration_GivenEmptyData_ReturnsCorrectDeclaration() throws IOException {
        String data = "";
        Comment comment = new Comment(data);
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals("<!--", declaration.getPrefix());
        assertEquals("comment", declaration.getLocalName());
    }

}