package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.*;

import static org.junit.Assert.*;

public class GeneratedParseStringInputTest {

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root></root>", "https://baseUri.com");
        assertNotNull(document);
    }

}