package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.TextNode;

import java.io.Reader;
import java.util.List;

public class GeneratedParse_WithInvalidXml_ReturnsEmptyDocument {

    @Test
    public void parse_WithInvalidXml_ReturnsEmptyDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader("<root>Hello World!</root>"), "");
        assertEquals(0, doc.getDocumentElement().getChildNodes().getLength());
    }

}