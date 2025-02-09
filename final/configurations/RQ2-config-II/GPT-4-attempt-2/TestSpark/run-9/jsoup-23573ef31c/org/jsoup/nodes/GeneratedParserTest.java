package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("http://parsertest.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}