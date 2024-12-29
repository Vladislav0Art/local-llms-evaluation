package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringInputTest {

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<tag></tag>", "http://base.uri");
        // check if the root element was correctly processed
        assertNotNull(doc.selectFirst("tag"));
    }

}