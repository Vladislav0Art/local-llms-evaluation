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
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(new Token.StartTag("div"));
        Assert.assertEquals("div", element.tagName());
    }

}