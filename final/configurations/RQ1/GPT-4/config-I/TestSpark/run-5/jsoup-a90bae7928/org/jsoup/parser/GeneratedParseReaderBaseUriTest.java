package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class GeneratedParseReaderBaseUriTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<tag>content</tag>");
        String baseUri = "https://www.example.com";
        Document result = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(result);
        assertEquals("<tag>content</tag>", result.outerHtml());
    }

}