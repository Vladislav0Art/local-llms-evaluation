package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("https://www.google.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}