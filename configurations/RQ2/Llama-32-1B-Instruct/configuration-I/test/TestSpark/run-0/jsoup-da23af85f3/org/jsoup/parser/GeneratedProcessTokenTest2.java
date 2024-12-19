package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedProcessTokenTest2 {

    @Test
    public void processTokenTest2() {
        Token token = new Token();
        HtmlTreeBuilderState state = treeBuilder.process(token, HtmlTreeBuilderState.HIDDEN);
        assertEquals(state, treeBuilder.defaultSettings());
    }

}