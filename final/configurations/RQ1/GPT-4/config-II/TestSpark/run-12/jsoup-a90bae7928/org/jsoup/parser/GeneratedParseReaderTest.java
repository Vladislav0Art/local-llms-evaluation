package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<test></test>"), "");
        assertEquals("test", document.select("test").first().nodeName());
    }

}