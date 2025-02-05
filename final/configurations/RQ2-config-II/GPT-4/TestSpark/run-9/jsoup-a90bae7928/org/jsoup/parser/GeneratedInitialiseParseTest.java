package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        Reader reader = new StringReader("<tag>content</tag>");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(reader, "http://baseUri.com", Parser.xmlParser());
        assertNotNull(builder.getBaseUri());
    }

}