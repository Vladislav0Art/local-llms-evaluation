package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPop_PopIsPerformedCorrectly {

    @Test
    public void pop_PopIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element();
        assertEquals(element, builder.pop());
    }

}