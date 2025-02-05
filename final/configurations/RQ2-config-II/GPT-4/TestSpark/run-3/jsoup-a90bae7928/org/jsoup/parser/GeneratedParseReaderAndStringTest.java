package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseReaderAndStringTest {

    private XmlTreeBuilder xmlTreeBuilder;
    private Parser parser;
    private String baseUri;

    @Before
    public void setup() {
        xmlTreeBuilder = new XmlTreeBuilder();
        parser = Parser.xmlParser();
        baseUri = "http://example.com/";
    }

    @Test
    public void parseReaderAndStringTest() {
        StringReader input = new StringReader("<root></root>");
        // test that parse correctly returns a Document
        assertNotNull(xmlTreeBuilder.parse(input, baseUri));
    }

}