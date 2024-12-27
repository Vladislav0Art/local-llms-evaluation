package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Reader reader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private Token token;

    @Mock
    private HtmlTreeBuilderState state;

    @Mock
    private Element element;

    @Mock
    private FormElement formElement;

    @Mock
    private Node node;

    @Mock
    private Document document;

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();
        assertEquals(parseSettings.getCharset(), "UTF-8");
    }

    @Test
    public void testNewInstance() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        HtmlTreeBuilder newInstance = htmlTreeBuilder.newInstance();
        assertEquals(newInstance.getClass(), HtmlTreeBuilder.class);
    }

    @Test
    public void testInitialiseParse() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        htmlTreeBuilder.initialiseParse(reader, baseUri, parser);
    }

}