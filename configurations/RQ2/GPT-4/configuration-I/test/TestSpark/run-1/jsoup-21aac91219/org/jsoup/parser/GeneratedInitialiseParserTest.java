package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Token;
import org.jsoup.parser.HtmlTreeBuilderState;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import java.io.Reader;

import static org.mockito.Mockito.*;

import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedInitialiseParserTest {

    @Test
    public void initialiseParserTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        StringReader input = new StringReader("Test input");
        String baseUri = "https://jsoup.org";
        Parser parser = Parser.htmlParser();
        htmlTreeBuilder.initialiseParse(input, baseUri, parser);
        assertNotNull(htmlTreeBuilder.getDocument());
    }

}