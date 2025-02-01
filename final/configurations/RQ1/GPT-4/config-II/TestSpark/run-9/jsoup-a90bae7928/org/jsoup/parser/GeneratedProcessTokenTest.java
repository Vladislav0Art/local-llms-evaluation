package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "tag";
        startTag.attributes.put("attribute", "value");
        Assert.assertTrue(xmlTreeBuilder.process(startTag));
    }

}