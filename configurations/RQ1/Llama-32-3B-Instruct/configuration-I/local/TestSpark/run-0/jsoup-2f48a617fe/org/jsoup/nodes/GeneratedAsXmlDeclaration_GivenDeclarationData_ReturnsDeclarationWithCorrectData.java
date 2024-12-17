package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedAsXmlDeclaration_GivenDeclarationData_ReturnsDeclarationWithCorrectData {

    @Test
    public void asXmlDeclaration_GivenDeclarationData_ReturnsDeclarationWithCorrectData() throws IOException {
        String data = "<!DOCTYPE html>";
        @Nullable XmlDeclaration result = new Comment(data).asXmlDeclaration();
        assertNotNull(result);
        assertEquals("<html>", result.getData());
    }

}