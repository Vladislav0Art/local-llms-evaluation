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
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Reader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String inputFragment = "<html><body></body></html>";
        Element context = null;
        String baseUri = "https://example.com";
        Parser parser = new Parser();
        List<Node> nodes = builder.parseFragment(inputFragment, context, baseUri, parser);
        assertNotNull(nodes);
    }

}