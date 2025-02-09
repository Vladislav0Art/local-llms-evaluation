package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseWithInputStringTest {

    @Test
    public void parseWithInputStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<span></span>", "");
        Assert.assertNotNull(document);
    }

}