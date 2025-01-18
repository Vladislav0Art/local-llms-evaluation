package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root><child/></root>", "https://www.example.com");
        Assert.assertEquals("Check root nodes", 1, document.getElementsByTag("root").size());
        Assert.assertEquals("Check child nodes", 1, document.getElementsByTag("child").size());
    }

}