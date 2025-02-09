package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder treeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<xml></xml>"), "http://google.com", parser);
        assertEquals("http://google.com", treeBuilder.getBaseUri());
    }

}