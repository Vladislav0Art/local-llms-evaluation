package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "p";
        xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("p", xmlTreeBuilder.currentElement().tagName());
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "p";
        xmlTreeBuilder.popStackToClose(endTag);
        Assert.assertEquals("", xmlTreeBuilder.currentElement().tagName());
    }

}