package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedParse_WithInvalidXml_ReturnsNull {

    @Test
    public void parse_WithInvalidXml_ReturnsNull() throws IOException {
        String xml = "<html><body>Hello World!</html>";
        Document document = new XmlTreeBuilder().parse(new StringReader(xml));
        assertNull(document);
    }

}