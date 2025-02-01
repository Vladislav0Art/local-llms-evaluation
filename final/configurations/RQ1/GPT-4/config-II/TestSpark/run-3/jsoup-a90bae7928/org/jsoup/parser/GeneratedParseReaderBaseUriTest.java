package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseReaderBaseUriTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<root></root>"), "http://example.com");
        assertEquals("<root></root>", doc.toString());
    }

}