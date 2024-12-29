package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseReaderInputTest {

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader("<tag></tag>"), "http://base.uri");
        // check if the root element was correctly processed
        assertNotNull(doc.selectFirst("tag"));
    }

}