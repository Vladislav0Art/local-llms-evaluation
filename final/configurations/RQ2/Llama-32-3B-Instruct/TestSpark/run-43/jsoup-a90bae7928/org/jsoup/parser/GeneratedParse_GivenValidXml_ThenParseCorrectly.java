package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Token;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedParse_GivenValidXml_ThenParseCorrectly {

    @Test
    public void parse_GivenValidXml_ThenParseCorrectly() {
        Reader input = new StringReader("<root><child/></root>");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(input, "http://example.com");
        assertNotNull(document);
    }

}