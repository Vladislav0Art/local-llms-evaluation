package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_GivenData_ReturnsNullIfCannotBeParsedAsDeclaration {

    @Test
    public void asXmlDeclaration_GivenData_ReturnsNullIfCannotBeParsedAsDeclaration() {
        String data = "This is a comment";
        @Nullable XmlDeclaration result = new Comment(data).asXmlDeclaration();
        assertNull(result);
    }

}