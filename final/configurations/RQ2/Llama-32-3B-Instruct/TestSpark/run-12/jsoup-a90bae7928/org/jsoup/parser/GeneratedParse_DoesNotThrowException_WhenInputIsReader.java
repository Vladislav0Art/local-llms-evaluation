package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedParse_DoesNotThrowException_WhenInputIsReader {

    @Test
    public void Parse_DoesNotThrowException_WhenInputIsReader() throws IOException {
        Reader reader = new StringReader("<html><body>Hello World!</body></html>");
        String baseUri = "https://example.com";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(reader, baseUri);
        assertNotNull(document);
    }

}