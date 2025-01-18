package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedParseStringTest {

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();

        Document doc = builder.parse("<node>test</node>", "http://base.uri");
        Element node = doc.select("node").first();
        assertNotNull(node);
        assertEquals("test", node.text());
    }

}