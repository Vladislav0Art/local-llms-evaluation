package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedParse_ReturnsDocumentWithRootElementAsBody {

    @Test
    public void Parse_ReturnsDocumentWithRootElementAsBody() throws IOException {
        String input = "<body>Hello World!</body>";
        Reader reader = new StringReader(input);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(reader, "https://example.com");
        assertEquals("body", document.tagName());
    }

}