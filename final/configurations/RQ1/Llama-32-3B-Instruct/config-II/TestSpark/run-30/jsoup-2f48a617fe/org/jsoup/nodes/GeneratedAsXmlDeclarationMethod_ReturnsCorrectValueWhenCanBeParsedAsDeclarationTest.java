package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationMethod_ReturnsCorrectValueWhenCanBeParsedAsDeclarationTest {

    @Test
    public void asXmlDeclarationMethod_ReturnsCorrectValueWhenCanBeParsedAsDeclarationTest() {
        Comment comment = new Comment("<!--<?xml version=\"1.0\" encoding=\"UTF-8\"?-->']");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}