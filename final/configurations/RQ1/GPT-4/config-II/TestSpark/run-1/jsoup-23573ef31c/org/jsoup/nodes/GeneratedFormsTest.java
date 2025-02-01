package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedFormsTest {

    private static final String BASE_URI = "https://google.com";

    @Test
    public void formsTest() {
        Document document = new Document(BASE_URI);
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

}