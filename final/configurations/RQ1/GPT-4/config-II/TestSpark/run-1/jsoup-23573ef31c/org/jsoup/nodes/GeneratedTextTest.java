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

public class GeneratedTextTest {

    private static final String BASE_URI = "https://google.com";

    @Test
    public void textTest() {
        Document document = new Document(BASE_URI);
        document.text("This is a test");
        Assert.assertEquals("This is a test", document.body().text());
    }

}