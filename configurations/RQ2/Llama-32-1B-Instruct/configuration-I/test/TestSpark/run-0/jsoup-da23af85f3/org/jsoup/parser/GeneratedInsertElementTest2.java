package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedInsertElementTest2 {

    @Test
    public void insertElementTest2() {
        Element element = new Element();
        treeBuilder.insert(element);
        assertEquals(treeBuilder.getStack(), Arrays.asList(element));
    }

}