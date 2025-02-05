package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("https://google.com");
        Parser parser = new Parser(doc);
        doc.parser(parser);
        Assert.assertEquals(parser, doc.parser());
    }

}