package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;

public class GeneratedParse InvalidXmlReader_MustReturnNull {

    @Test
    public void parse

    InvalidXmlReader_MustReturnNull() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = null;
        String baseUri = "http://example.com";
        Document document = builder.parse(reader, baseUri);
        assertNull(document);
    }

}