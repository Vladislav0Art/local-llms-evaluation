package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.Entities.EscapeMode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = Jsoup.parse("<form id='loginForm'><input name='username' value='myUsername' /></form>");
        List<FormElement> forms = doc.forms();
        Assert.assertEquals(1, forms.size());
        Assert.assertEquals("loginForm", forms.get(0).id());
    }

}