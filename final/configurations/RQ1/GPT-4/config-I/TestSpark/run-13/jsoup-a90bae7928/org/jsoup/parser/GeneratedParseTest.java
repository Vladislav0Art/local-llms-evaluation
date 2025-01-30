package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        final Reader input = new StringReader("<test></test>");
        final String baseUri = "http://test.com";
        final XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(input, baseUri);

        assertNotNull(document);
        assertEquals("<test></test>", document.toString());
    }

}