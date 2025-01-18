package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        String baseUri = "dummyUri";
        Parser parser = Parser.xmlParser();
        xmlTreeBuilder.initialiseParse(reader, baseUri, parser);
        assertEquals(baseUri, xmlTreeBuilder.getBaseUri());
    }

}