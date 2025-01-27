package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedParse_GivenReader_ThrowsExceptionWhenInputIsInvalid {

    @Test
    public void parse_GivenReader_ThrowsExceptionWhenInputIsInvalid() {
        Reader input = new StringReader("<xml><root></root>");
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertThrows(ParseSettings.ParseSettingsException.class, () -> treeBuilder.parse(input, baseUri));
    }

}