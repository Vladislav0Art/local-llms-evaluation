package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        List<Node> nd = xb.parseFragment("<html></html>", "", new Parser(xb));
        Assert.assertEquals(1, nd.size());
    }

}