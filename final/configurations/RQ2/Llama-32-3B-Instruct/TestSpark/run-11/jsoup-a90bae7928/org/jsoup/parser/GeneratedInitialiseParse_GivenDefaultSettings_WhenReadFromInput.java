package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedInitialiseParse_GivenDefaultSettings_WhenReadFromInput {

    @Test
    public void initialiseParse_GivenDefaultSettings_WhenReadFromInput() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";

        // when
        builder.initialiseParse(input, baseUri, null);

        // then
        assertEquals(2, builder.defaultSettings().getNamespacePrefixes().size());
    }

}