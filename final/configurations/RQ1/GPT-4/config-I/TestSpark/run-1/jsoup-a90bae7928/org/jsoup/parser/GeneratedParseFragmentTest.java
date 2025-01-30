package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tokeniser;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        Parser xmlParser = new Parser(new XmlTreeBuilder());
        List nodeList = Jsoup.parse("<root></root>", "www.example.com", xmlParser).childNodes();

        assertTrue(nodeList.get(0) instanceof org.jsoup.nodes.Element);
    }

}