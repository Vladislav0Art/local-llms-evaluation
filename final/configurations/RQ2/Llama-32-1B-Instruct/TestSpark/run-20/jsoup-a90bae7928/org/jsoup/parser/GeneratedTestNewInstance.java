package org.jsoup.parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.Token;
import org.jsoup.parser.TokenReader;
import org.jsoup.parser.ParseException;

public class GeneratedTestNewInstance {

    public static DocumentBuilder builder = new DocumentBuilder();

    @BeforeClass
    public static void init() {
        builder.setParseSettings(new ParseSettings());
    }

    @AfterClass
    public static void close() {
        builder.close();
    }

    private XmlTreeBuilder parseTree(String input) throws IOException, ParseException {
        return builder.parse(new StringReader(input));
    }

    @Test
    public void testNewInstance() throws IOException, ParseException {
        Document doc = parseTree("<doc><root><child/></root></doc>");
        assertEquals(1, doc.childNodes().size());
        assertEquals("doc", doc.childNodes().get(0).getNodeName());
        assertEquals("<root>", doc.childNodes().get(0).getNodeName());
    }

}