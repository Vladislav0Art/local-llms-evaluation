package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedNewInstanceReturnsNewInstance {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void newInstanceReturnsNewInstance() {
        HtmlTreeBuilder instance = htmlTreeBuilder.newInstance();
        assertNotNull(instance);
    }

}