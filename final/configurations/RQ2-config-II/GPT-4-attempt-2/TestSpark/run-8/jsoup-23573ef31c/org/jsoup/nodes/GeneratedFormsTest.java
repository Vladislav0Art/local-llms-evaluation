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

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = Jsoup.parse("<form id=\"form1\"><input name=\"msg\" value=\"Hello World\"></form>");
        List<FormElement> formElements = doc.forms();
        Assert.assertEquals(1, formElements.size());
        Assert.assertEquals("form1", formElements.get(0).id());
    }

}