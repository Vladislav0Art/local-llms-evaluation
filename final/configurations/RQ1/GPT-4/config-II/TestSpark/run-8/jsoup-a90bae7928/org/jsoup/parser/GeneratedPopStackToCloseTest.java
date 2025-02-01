package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<tag></tag>"), "http://base.uri",
                new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insert(new Token.StartTag("tag"));
        xmlTreeBuilder.popStackToClose(new Token.EndTag("tag"));
        Assert.assertEquals("", xmlTreeBuilder.doc.text());
    }

}