package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseReaderInputTest {

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<rootNode/>");
        Document xmlDoc = xmlTreeBuilder.parse(input, "http://testUri");
        assertNotNull(xmlDoc);
        assertEquals("<rootnode></rootnode>", xmlDoc.outerHtml());
    }

}