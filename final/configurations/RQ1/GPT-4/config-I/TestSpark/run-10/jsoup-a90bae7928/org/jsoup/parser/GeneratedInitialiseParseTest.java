package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<rootNode/>");
        xmlTreeBuilder.initialiseParse(input, "http://testUri", new Parser(xmlTreeBuilder));
        assertEquals("http://testUri", xmlTreeBuilder.doc.baseUri());
        assertEquals(1, xmlTreeBuilder.stack.size());
    }

}