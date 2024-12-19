package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedTest-

process {

    private HtmlTreeBuilder builder = new HtmlTreeBuilder();

    @Test
    public void test -process() {
        Element token = Mockito.mock(Element.class);
        boolean result = builder.process(token);
        assertEquals(true, result);
    }

}