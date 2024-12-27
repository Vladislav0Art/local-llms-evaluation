package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedMarkInsertionMode_MarkIsInsertedCorrectly {

    @Test
    public void markInsertionMode_MarkIsInsertedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.markInsertionMode();
        assertTrue(builder.isFragmentParsing());
    }

}