package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader stringReader = new StringReader("<xml></xml>");
        Document doc = builder.parse(stringReader, "http://example.com");
        assertEquals("<xml></xml>", doc.wholeText().trim());
    }

}