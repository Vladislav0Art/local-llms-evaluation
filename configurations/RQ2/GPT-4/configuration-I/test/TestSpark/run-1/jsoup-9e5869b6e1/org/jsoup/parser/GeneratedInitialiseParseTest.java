package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Reader input = new StringReader("<html></html>");
        String baseUri = "http://test.com";
        Parser parser = Parser.htmlParser();

        builder.initialiseParse(input, baseUri, parser);
        assertEquals(baseUri, builder.getBaseUri());
    }

}