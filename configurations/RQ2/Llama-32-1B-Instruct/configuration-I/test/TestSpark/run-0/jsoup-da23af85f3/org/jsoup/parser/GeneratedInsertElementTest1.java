package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedInsertElementTest1 {

    @Test
    public void insertElementTest1() {
        Element element = treeBuilder.insert(new Token.StartTag("p"));
        assertNotSame(element, null);
    }

}