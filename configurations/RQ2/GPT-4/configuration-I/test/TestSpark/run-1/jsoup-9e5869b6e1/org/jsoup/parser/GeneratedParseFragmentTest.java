package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String inputFragment = "<div>Test</div>";
        Element context = null;
        String baseUri = "http://test.com";
        Parser parser = Parser.htmlParser();

        List nodeList = builder.parseFragment(inputFragment, context, baseUri, parser);
        assertFalse(nodeList.isEmpty());
    }

}