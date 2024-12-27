package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
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
public class GeneratedNewInstanceTest {

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Mock
    private Token token;

    @Mock
    private Element element;

    @Mock
    private HtmlTreeBuilderState state;

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void newInstanceTest() {
        HtmlTreeBuilder newInstance = htmlTreeBuilder.newInstance();
        assertEquals(htmlTreeBuilder, newInstance);
    }

}