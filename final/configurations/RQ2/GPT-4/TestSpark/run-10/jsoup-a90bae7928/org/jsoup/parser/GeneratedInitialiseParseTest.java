package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<root/>"), "http://base.uri", new Parser(builder));
        Document doc = builder.parse(new StringReader("<root/>"), "http://base.uri");
        assertEquals("http://base.uri", doc.baseUri());
    }

}