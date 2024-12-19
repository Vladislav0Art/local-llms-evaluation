package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        String inputFragment = "<p>This is a paragraph</p>";
        HtmlTreeBuilderState state = treeBuilder.parseFragment(inputFragment);
        assertNotSame(state, null);
    }

}