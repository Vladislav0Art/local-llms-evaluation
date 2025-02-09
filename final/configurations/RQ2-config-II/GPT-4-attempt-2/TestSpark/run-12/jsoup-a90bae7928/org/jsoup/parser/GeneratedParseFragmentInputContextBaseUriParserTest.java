package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedParseFragmentInputContextBaseUriParserTest {

    @Test
    public void parseFragmentInputContextBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("p"), "baseUri");
        List<Node> nodeList = xmlTreeBuilder.parseFragment("fragment parsing test", context, "baseUri", Parser.xmlParser());
        Assert.assertNotNull(nodeList);
    }

}