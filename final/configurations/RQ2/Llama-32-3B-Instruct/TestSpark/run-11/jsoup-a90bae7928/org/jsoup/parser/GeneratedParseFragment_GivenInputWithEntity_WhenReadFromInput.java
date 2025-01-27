package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedParseFragment_GivenInputWithEntity_WhenReadFromInput {

    @Test
    public void parseFragment_GivenInputWithEntity_WhenReadFromInput() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<fragment><child>&amp;</child></fragment>");
        String baseUri = "http://example.com";

        // when
        List<Node> nodes = builder.parseFragment(input, baseUri, null);

        // then
        assertEquals(1, nodes.size());
    }

}