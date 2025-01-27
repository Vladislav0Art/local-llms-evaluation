package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedParse_GivenEmptyString_ThrowsExceptionWhenInputIsInvalid {

    @Test
    public void parse_GivenEmptyString_ThrowsExceptionWhenInputIsInvalid() {
        String input = "";
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertThrows(ParseSettings.ParseSettingsException.class, () -> treeBuilder.parse(input, baseUri));
    }

}