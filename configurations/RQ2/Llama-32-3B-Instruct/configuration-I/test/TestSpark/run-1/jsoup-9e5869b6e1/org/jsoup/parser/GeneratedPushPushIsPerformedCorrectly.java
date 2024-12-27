package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPushPushIsPerformedCorrectly {

    @Test
    public void pushPushIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element();
        builder.push(element);
        assertTrue(builder.onStack(element));
    }

}