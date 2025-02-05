package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithContextTest {

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
    public void parseFragmentWithContextTest() {
        Element context = new Element("context");
        String inputFragment = "<fragment context='context'></fragment>";
        // Test that parseFragment correctly returns a list of nodes
        assertNotNull(xmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parser));
    }

}