package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedParse_DoesNotThrowException_WhenInputIsString {

    @Test
    public void Parse_DoesNotThrowException_WhenInputIsString() {
        String input = "<html><body>Hello World!</body></html>";
        String baseUri = "https://example.com";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(input, baseUri);
        assertNotNull(document);
    }

}