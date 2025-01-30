package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.mockito.Mockito.*;

public class GeneratedProcessStartTagTest {

    @Test
    public void processStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<test></test>";
        String baseUri = "http://test.com";
        xmlTreeBuilder.initialiseParse(new StringReader(input), baseUri, new Parser(xmlTreeBuilder));
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("test");
        xmlTreeBuilder.process(startTag);
        Assert.assertEquals(xmlTreeBuilder.stack.size(), 2);
        Assert.assertTrue(xmlTreeBuilder.stack.get(1) instanceof Element);
        Assert.assertEquals(xmlTreeBuilder.stack.get(1).nodeName(), "test");
    }

}