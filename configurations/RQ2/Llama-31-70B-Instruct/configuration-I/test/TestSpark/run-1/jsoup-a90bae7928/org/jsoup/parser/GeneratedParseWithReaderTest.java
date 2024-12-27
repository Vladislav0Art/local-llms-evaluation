package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedParseWithReaderTest {

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = Mockito.mock(Reader.class);
        String baseUri = "baseUri";
        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertEquals(document, xmlTreeBuilder.parse(input, baseUri));
    }

}