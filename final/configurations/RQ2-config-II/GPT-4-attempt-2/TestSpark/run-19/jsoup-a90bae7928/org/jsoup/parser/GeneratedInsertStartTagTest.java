package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "p";
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("p", element.tagName());
    }

}