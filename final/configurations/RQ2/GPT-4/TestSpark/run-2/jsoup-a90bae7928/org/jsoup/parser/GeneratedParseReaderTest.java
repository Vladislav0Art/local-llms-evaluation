package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<node>test</node>");

        Document doc = builder.parse(reader, "http://base.uri");
        Element node = doc.select("node").first();
        assertNotNull(node);
        assertEquals("test", node.text());
    }

}