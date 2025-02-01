package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<tag>"), "http://base.uri", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insert(new Token.StartTag("tag"));
        Assert.assertEquals("tag", xmlTreeBuilder.doc.text());
    }

}