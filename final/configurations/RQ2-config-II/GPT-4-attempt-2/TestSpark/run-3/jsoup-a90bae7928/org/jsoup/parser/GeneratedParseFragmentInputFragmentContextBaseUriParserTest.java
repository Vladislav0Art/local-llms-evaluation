package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentInputFragmentContextBaseUriParserTest {

    @Test
    public void parseFragmentInputFragmentContextBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element divElement = new Element("div");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<message>hi</message>", divElement, "http://example.com", Parser.xmlParser());
        Assert.assertEquals(1, nodes.size());
    }

}