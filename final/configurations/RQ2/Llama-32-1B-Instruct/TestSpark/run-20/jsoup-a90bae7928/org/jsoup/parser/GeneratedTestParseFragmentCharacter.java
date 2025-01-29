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

public class GeneratedTestParseFragmentCharacter {

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
    public void testParseFragmentCharacter() throws IOException {
        String input = "<doc><root><child></root></doc>";
        Document doc = parseTree(input);
        Element rootElement = (Element) doc.getNodes().get(0).getNodeName();
        Token characterToken = parseTree("<char>abc</char>");
        rootElement.appendChild(characterToken);
    }

}