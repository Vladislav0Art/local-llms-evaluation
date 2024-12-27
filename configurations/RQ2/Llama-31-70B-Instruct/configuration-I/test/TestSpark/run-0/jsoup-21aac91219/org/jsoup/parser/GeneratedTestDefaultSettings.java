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
public class GeneratedTestDefaultSettings {

    @Mock
    private Reader mockReader;

    @Mock
    private String mockBaseUri;

    @Mock
    private Parser mockParser;

    @Mock
    private Token mockToken;

    @Mock
    private HtmlTreeBuilderState mockState;

    @Mock
    private Element mockElement;

    @Mock
    private FormElement mockFormElement;

    @Mock
    private Node mockNode;

    @Mock
    private Document mockDocument;

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();
        assertEquals(parseSettings.getCharset(), "UTF-8");
    }

}