package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        Element element = xmlTreeBuilder.insert(startTag);
        Assert.assertNotNull(element);
    }

}