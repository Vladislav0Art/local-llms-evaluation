package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        Token.StartTag startTagToken = new Token.StartTag();
        startTagToken.nameAttr("test");

        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(startTagToken);

        Element element = xmlTreeBuilder.doc.body().child(0);
        Assert.assertEquals("test", element.tagName());
    }

}