package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedProcess_TOKENAndStateAreProcessedCorrectly {

    @Test
    public void process_TOKENAndStateAreProcessedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = new Token();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        assertTrue(builder.process(token, state));
    }

}