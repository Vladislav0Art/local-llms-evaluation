package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentElementTest {

    @Test
    public void parseFragmentElementTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test>test</test>", new Element("test"), "http://test.com", new Parser(xmlTreeBuilder));
        Assert.assertFalse(nodes.isEmpty());
    }

}