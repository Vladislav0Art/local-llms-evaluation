package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertNodeWithTokenTest {

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
    public void insertNodeWithTokenTest() {
        Element element = new Element("dummy");
        Token.StartTag token = new Token.StartTag("dummy");
        xmlTreeBuilder.insertNode(element, token);
        // check if the node has been inserted correctly
    }

}