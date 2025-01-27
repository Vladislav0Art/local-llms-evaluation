package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedParse_GivenValidInput_ReturnsDocument {

    @Test
    public void parse_GivenValidInput_ReturnsDocument() {
        String input = "<xml><root><child/></root>";
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(input, baseUri);
        assertNotNull(document);
    }

}