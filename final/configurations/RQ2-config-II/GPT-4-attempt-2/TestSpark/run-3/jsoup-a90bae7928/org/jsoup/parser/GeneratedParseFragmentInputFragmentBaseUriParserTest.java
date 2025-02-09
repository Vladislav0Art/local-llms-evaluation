package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentInputFragmentBaseUriParserTest {

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<message>hi</message>", "http://example.com", Parser.xmlParser());
        Assert.assertEquals(1, nodes.size());
    }

}