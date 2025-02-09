package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = Jsoup.parse("<form id=\"form1\"><input name=\"msg\" value=\"Hello World\"></form>");
        FormElement formElement = doc.expectForm("form");
        Assert.assertNotNull(formElement);
        Assert.assertEquals("form1", formElement.id());
    }

}