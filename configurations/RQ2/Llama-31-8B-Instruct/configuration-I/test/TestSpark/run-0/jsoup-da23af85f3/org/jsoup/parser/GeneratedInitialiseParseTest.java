package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.Reader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import org.mockito.Mock;

@RunWith(JUnit4.class)
public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Reader input = new StringReader("");
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        builder.initialiseParse(input, baseUri, parser);
    }

}