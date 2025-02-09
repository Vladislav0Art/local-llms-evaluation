package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element("div");
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<a></a>", context, "", Mockito.mock(Parser.class));
        Assert.assertNotNull(nodeList);
    }

}