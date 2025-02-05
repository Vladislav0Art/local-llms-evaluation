package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element("context");
        List<Node> nodes = builder.parseFragment("<test><inner>text</inner></test>", context, "http://base.uri", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
    }

}