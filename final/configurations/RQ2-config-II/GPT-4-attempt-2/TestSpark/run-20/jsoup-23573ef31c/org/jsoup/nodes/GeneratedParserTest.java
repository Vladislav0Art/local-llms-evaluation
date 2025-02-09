package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("http://example.com");
        Parser parser = new Parser(new TreeBuilder());
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}