package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Tokeniser tokeniser = new Tokeniser(new Parser(xmlTreeBuilder));
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "www.example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.process(tokeniser.read());
        assertTrue(xmlTreeBuilder.stack.size() > 0);
    }

}