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
import org.junit.Before;
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
public class GeneratedTestNewInstance {

    @Mock
    private Reader mockReader;

    @Mock
    private Parser mockParser;

    @Mock
    private Token mockToken;

    @Mock
    private Element mockElement;

    @Mock
    private Document mockDocument;

    @Mock
    private FormElement mockFormElement;

    @Mock
    private Node mockNode;

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void testNewInstance() {
        HtmlTreeBuilder newInstance = htmlTreeBuilder.newInstance();
        assertEquals(htmlTreeBuilder, newInstance);
    }

}