package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        String baseUri = "http://example.com";
        Reader reader = new FileReader("input.html");
        Parser parser = new Parser();
        HtmlTreeBuilderState state = treeBuilder.initialiseParse(reader, baseUri, parser);

        assertEquals(state, treeBuilder.defaultSettings());
    }

}