package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<tag c=\"character\">"), "http://base.uri",
                new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insert(new Token.Character("character", true));
        Assert.assertEquals("", xmlTreeBuilder.doc.text());
    }

}