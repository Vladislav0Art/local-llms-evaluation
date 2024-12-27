package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

import java.io.StringReader;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedMarkInsertionModeTest {

    @Test
    public void markInsertionModeTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.markInsertionMode();
        assertNotNull(treeBuilder);
    }

}