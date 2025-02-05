package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("https://www.example.com");
        Parser parser = new Parser(new Document("https://www.example.com"));
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}