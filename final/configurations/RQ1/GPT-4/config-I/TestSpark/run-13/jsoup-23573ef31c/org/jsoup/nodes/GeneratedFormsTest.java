package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Document.createShell("https://example.com");
        document.body().appendElement("form");
        List<FormElement> forms = document.forms();
        Assert.assertFalse(forms.isEmpty());
    }

}