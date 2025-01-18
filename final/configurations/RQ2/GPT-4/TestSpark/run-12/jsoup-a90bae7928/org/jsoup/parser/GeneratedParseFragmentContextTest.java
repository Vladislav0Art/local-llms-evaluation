package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentContextTest {

    @Test
    public void parseFragmentContextTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        List<Node> nd = xb.parseFragment("<html></html>", null, "", new Parser(xb));
        Assert.assertEquals(1, nd.size());
    }

}