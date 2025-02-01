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

public class GeneratedTitleTest {

    private static final String BASE_URI = "https://google.com";

    @Test
    public void titleTest() {
        Document document = Document.createShell(BASE_URI);
        document.title("Google");
        Assert.assertEquals("Google", document.title());
    }

}