package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Parser parser = new Parser(treeBuilder);
        String baseUri = "http://base.uri";
        String inputFragment = "<note><to>Tove</to></note>";
        List<Element> nodeList = treeBuilder.parseFragment(inputFragment, baseUri, parser);
        Assert.assertTrue(!nodeList.isEmpty());
        Assert.assertEquals(Node.class, nodeList.get(0).getClass());
    }

}