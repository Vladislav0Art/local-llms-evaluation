package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParse_SimpleXmlReaderWithBaseUri {

    @Test
    public void parse_SimpleXmlReaderWithBaseUri() throws Exception {
        Reader input = new StringReader("<root><child/></root>");
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(input, "http://example.com");
        assertNotNull(document);
        assertEquals(1, document.children().size());
    }

}