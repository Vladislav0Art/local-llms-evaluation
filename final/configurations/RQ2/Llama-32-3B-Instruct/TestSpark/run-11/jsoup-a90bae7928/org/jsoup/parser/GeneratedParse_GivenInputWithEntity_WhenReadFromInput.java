package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedParse_GivenInputWithEntity_WhenReadFromInput {

    @Test
    public void parse_GivenInputWithEntity_WhenReadFromInput() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child>&amp;</child></root>");
        String baseUri = "http://example.com";

        // when
        Document document = builder.parse(input, baseUri);

        // then
        assertEquals("amp", document.body(0).children().get(1).data());
    }

}