package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedInitialiseParse_ParsesInputCorrectly {

    @Test
    public void initialiseParse_ParsesInputCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String input = "input";
        String baseUri = "/baseuri";
        Parser parser = new Parser();
        builder.initialiseParse(input, baseUri, parser);
        assertNotNull(builder.parseFragment(input, null, baseUri, parser));
    }

}