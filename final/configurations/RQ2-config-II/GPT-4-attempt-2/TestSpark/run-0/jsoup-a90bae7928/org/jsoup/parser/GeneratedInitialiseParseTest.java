package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "http://example.com/";
        xmlTreeBuilder.initialiseParse(new StringReader("<html><body>test</body></html>"), baseUri, parser);
        assertEquals(Document.class, xmlTreeBuilder.doc.getClass());
        assertEquals(baseUri, xmlTreeBuilder.doc.baseUri());
    }

}