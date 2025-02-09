package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = new Parser(new TreeBuilder());
        doc.parser(parser);
        Assert.assertEquals(parser, doc.parser());
    }

}