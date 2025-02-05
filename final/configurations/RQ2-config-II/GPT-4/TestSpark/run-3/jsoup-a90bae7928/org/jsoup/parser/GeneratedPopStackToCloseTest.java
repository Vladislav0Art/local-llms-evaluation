package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTest {

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
    public void popStackToCloseTest() {
        Token.EndTag token = new Token.EndTag();
        token.nameAttr("closingTag");
        xmlTreeBuilder.insert(token);
        xmlTreeBuilder.popStackToClose(token);
        // check if stack is popped and tag is closed
    }

}