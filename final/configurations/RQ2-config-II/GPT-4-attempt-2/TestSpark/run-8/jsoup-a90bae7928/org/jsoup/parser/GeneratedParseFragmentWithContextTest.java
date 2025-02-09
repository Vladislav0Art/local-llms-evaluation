package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<span>Test</span>", new Element("div"), "http://example.com", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("span", nodes.get(0).nodeName());
    }

}