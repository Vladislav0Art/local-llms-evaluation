package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.util.List;

public class GeneratedParseReaderInputTest {

    @Test
    public void parseReaderInputTest() {
        Reader input = new StringReader("<root><node>Text</node></root>");
        String baseUri = "http://example.com";
        Document document = XmlTreeBuilderTest().initialiseParse(input, baseUri).parse(input, baseUri);
        assertNotNull(document);
    }

}