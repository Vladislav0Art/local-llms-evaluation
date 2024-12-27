package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedParse_WithValidXml_ReturnsDocument {

    @Test
    public void parse_WithValidXml_ReturnsDocument() throws IOException {
        String xml = "<html><body>Hello World!</body></html>";
        Document document = new XmlTreeBuilder().parse(new StringReader(xml));
        assertNotNull(document);
    }

}