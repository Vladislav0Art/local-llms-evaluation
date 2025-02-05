package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("html"), "http://base.url");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<html></html>", context, "http://base.url", new Parser(xmlTreeBuilder));
        Assert.assertNotNull(nodes);
    }

}