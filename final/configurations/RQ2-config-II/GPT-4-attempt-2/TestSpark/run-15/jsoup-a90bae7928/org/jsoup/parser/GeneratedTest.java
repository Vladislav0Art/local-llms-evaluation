package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    // Test initialiseParse method

    @Test
    public void initialiseParseTest() {
        StringReader stringReader = new StringReader("<root></root>");
        String baseUri = "http://base.uri";
        Parser parser = new Parser(xmlTreeBuilder);

        xmlTreeBuilder.initialiseParse(stringReader, baseUri, parser);
    }

    @Test
    public void parseWithReaderAndBaseUriTest() {
        StringReader stringReader = new StringReader("<root></root>");
        String baseUri = "http://base.uri";
        Document document = xmlTreeBuilder.parse(stringReader, baseUri);

        Assert.assertNotNull(document);
    }

    @Test
    public void parseWithStringAndBaseUriTest() {
        String input = "<root></root>";
        String baseUri = "http://base.uri";
        Document document = xmlTreeBuilder.parse(input, baseUri);

        Assert.assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilderNew = xmlTreeBuilder.newInstance();

        Assert.assertNotNull(xmlTreeBuilderNew);
    }

    @Test
    public void insertNodeTest() {
        Node node = new Element("newNode");
        xmlTreeBuilder.insertNode(node);

        List<Node> nodeList = xmlTreeBuilder.getStack();
        Assert.assertTrue(nodeList.contains(node));
    }

    @Test
    public void parseFragmentTest() {
        String inputFragment = "<fragment></fragment>";
        String baseUri = "http://base.uri";
        Parser parser = new Parser(xmlTreeBuilder);

        List<Node> nodeList = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);
        Assert.assertFalse(nodeList.isEmpty());
    }

}