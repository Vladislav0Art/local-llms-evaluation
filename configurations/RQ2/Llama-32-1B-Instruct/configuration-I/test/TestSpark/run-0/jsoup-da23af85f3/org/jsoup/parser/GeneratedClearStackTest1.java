package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedClearStackTest1 {

    @Test
    public void clearStackTest1() {
        List<Element> stack = treeBuilder.getStack();
        treeBuilder.clearStackToTableContext();
        assertNotSame(stack, null);
    }

}