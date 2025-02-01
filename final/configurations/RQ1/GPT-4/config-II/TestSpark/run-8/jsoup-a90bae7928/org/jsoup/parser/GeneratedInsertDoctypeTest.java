package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<!DOCTYPE html>"), "http://base.uri",
                new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insert(new Token.Doctype("html"));
        Assert.assertEquals("", xmlTreeBuilder.doc.text());
    }

}