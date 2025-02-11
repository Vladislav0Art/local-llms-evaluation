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

public class GeneratedParse_WithEmptyInputAndBaseUriCallsParse {

    @Test
    public void parse_WithEmptyInputAndBaseUriCallsParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader(""), "http://example.com");
        assertNotNull(doc);
    }

}