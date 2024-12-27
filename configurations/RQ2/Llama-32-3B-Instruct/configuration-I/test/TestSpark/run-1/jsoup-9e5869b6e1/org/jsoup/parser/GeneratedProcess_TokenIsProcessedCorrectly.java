package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedProcess_TokenIsProcessedCorrectly {

    @Test
    public void process_TokenIsProcessedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = new Token();
        assertTrue(builder.process(token));
    }

}