package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertTrue(xmlTreeBuilder.process(new Token.StartTag()));
    }

}