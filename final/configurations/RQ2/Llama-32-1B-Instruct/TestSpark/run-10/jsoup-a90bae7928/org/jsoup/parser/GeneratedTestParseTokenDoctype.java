package org.jsoup.parser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class GeneratedTestParseTokenDoctype {

    private TreeBuilder treeBuilder;

    @Before
    public void setup() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void testParseTokenDoctype() throws Exception {
        String input = "<root><doctype>DTD</doctype></root>";
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        Document document = treeBuilder.parse(input, baseUri);
        Assert.notNull(document, "Expected a valid XMLDocument");
        Assert.isInstanceOf(Document.class, document);
    }

}