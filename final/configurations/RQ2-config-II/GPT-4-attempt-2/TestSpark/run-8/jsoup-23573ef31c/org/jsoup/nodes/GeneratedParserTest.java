package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("https://www.example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        Assert.assertEquals(parser, doc.parser());
    }

}