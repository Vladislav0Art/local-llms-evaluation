package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tokeniser;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "www.example.com", parser);

        assertTrue(xmlTreeBuilder.doc.outputSettings().prettyPrint() == false);
    }

}