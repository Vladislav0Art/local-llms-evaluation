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

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = Document.createShell("https://example.com");
        document.parser(Parser.htmlParser());
        Assert.assertEquals(Parser.htmlParser().getClass(), document.parser().getClass());
    }

}