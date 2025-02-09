package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseWithReaderTest {

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<a></a>"), "");
        Assert.assertNotNull(document);
    }

}