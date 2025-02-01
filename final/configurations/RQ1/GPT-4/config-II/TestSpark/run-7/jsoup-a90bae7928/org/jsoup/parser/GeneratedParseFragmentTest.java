package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<tag>content</tag>", "http://example.com", Mockito.mock(Parser.class));

        assertFalse(nodes.isEmpty());
        assertEquals("content", nodes.get(0).childNode(0).outerHtml());
    }

}