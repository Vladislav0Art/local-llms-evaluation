package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
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
public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        String inputFragment = "<html></html>";
        Element context = null;
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        List<Node> nodes = htmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parser);
        assertNotNull(nodes);
    }

}