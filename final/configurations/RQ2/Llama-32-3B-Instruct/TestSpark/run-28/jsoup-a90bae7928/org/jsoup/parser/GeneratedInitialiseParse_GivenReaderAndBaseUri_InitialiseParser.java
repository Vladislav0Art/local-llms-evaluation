package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedInitialiseParse_GivenReaderAndBaseUri_InitialiseParser {

    @Test
    public void initialiseParse_GivenReaderAndBaseUri_InitialiseParser() {
        Reader input = new StringReader("<xml><root/></xml>");
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(input, baseUri, parser);
        assertNotNull(parser);
    }

}