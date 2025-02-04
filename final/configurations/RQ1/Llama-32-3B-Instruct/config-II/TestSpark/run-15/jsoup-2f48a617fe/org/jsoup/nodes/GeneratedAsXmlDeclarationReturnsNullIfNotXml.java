package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationReturnsNullIfNotXml {

    @Test
    public void asXmlDeclarationReturnsNullIfNotXml() {
        Comment comment1 = new Comment("data");
        assertNull(comment1.asXmlDeclaration());

        Comment comment2 = new Comment("!XML Declaration");
        assertNull(comment2.asXmlDeclaration());
    }

}