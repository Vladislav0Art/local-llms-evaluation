package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetStack_GetStackReturnsCorrectElements {

    @Test
    public void getStack_GetStackReturnsCorrectElements() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        List<Element> stack = builder.getStack();
        assertNotNull(stack);
    }

}