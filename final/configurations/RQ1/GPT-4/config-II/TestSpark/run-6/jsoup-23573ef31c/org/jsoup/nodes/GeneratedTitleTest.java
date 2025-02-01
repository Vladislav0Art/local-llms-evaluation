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

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document doc = Jsoup.parse("<title>Hello World</title>");
        String title = doc.title();
        Assert.assertEquals("Hello World", title);
    }

}