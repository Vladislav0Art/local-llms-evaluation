package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_GivenDeclarationWithFragment_ReturnsNull {

    @Test
    public void asXmlDeclaration_GivenDeclarationWithFragment_ReturnsNull() throws IOException {
        String data = "<!DOCTYPE html><html></html>";
        @Nullable XmlDeclaration result = new Comment(data).asXmlDeclaration();
        assertNull(result);
    }

}