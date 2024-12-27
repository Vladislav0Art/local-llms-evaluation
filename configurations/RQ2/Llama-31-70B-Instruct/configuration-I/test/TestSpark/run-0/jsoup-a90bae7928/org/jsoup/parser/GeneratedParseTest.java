package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "input";
        String baseUri = "baseUri";
        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertEquals(document, xmlTreeBuilder.parse(input, baseUri));
    }

}