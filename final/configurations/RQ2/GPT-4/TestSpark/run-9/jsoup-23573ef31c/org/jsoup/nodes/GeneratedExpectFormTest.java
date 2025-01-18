package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedExpectFormTest {

    @Test
    public void expectFormTest() {
        Document doc = new Document("http://example.com");
        FormElement form = doc.expectForm("form");

        Assert.assertNotNull(form);
    }

}