package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedParse_ReturnsDocumentWithRootElementAsHtml {

    @Test
    public void Parse_ReturnsDocumentWithRootElementAsHtml() throws IOException {
        String input = "<html><body>Hello World!</body></html>";
        Reader reader = new StringReader(input);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(reader, "https://example.com");
        assertEquals("html", document.tagName());
    }

}