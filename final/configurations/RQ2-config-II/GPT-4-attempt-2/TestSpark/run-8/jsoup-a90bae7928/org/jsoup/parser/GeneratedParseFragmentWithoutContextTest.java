package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseFragmentWithoutContextTest {

    @Test
    public void parseFragmentWithoutContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<p>Test</p>", "http://example.com", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("p", nodes.get(0).nodeName());
    }

}