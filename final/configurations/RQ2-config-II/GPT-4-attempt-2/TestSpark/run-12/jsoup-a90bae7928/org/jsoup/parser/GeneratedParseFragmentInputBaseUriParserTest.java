package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedParseFragmentInputBaseUriParserTest {

    @Test
    public void parseFragmentInputBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodeList = xmlTreeBuilder.parseFragment("fragment parsing test", "baseUri", Parser.xmlParser());
        Assert.assertNotNull(nodeList);
    }

}