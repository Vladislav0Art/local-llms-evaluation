package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedParse_ReturnsDocumentWithRootElementAsDiv {

    @Test
    public void Parse_ReturnsDocumentWithRootElementAsDiv() throws IOException {
        String input = "<div>Hello World!</div>";
        Reader reader = new StringReader(input);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(reader, "https://example.com");
        assertEquals("div", document.tagName());
    }

    public static class XmlTreeBuilder {
        public boolean initialiseParse(Reader reader, String baseUrl) throws IOException {
            // implementation
            return true;
        }

        public Document parse(Reader reader, String baseUrl) throws IOException {
            // implementation
            return null;
        }
    }

}