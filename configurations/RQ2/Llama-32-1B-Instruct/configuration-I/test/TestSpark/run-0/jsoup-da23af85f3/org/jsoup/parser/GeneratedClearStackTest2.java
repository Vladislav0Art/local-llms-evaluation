package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedClearStackTest2 {

    @Test
    public void clearStackTest2() {
        Element element = new Element();
        List<Element> stack = treeBuilder.getStack();
        stack.add(element);
        treeBuilder.clearStackToTableRowContext();
        assertEquals(stack, Arrays.asList(element));
    }

}