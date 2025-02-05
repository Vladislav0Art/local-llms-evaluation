package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertTokenTest {

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
    public void insertTokenTest() {
        Token token = new Token.Comment();
        xmlTreeBuilder.insert(token);
        // check if the token has been inserted correctly
    }

}