package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
        Document doc = new Document("http://www.google.com");
        List<FormElement> forms = doc.forms();
        Assert.assertNotNull(forms);
        Assert.assertTrue(forms.isEmpty());
    }

}